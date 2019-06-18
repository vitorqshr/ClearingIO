package org.clearingio.iso8583.builder;

import org.clearingio.iso8583.annotation.Bit;
import org.clearingio.iso8583.annotation.MTI;
import org.clearingio.iso8583.annotation.enumeration.DataLength;
import org.clearingio.iso8583.annotation.enumeration.DataRepresentation;
import org.clearingio.iso8583.annotation.enumeration.Encode;
import org.clearingio.iso8583.annotation.enumeration.Justification;
import org.clearingio.iso8583.exception.NotFoundMTIException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.*;
import java.math.BigInteger;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MsgBuilder<T> {

	private static Logger LOGGER = LoggerFactory.getLogger(MsgBuilder.class);

	private Encode encode;
	private Class<T> type;
	private Field fieldMTI;
	private Field[] fieldsBit;

	public MsgBuilder(Class<T> type, Encode encode) throws NotFoundMTIException {
		this.type = type;
		this.encode = encode;

		fieldsBit = new Field[128];
		defFields(type);
		if(fieldMTI == null || !fieldMTI.isAnnotationPresent(MTI.class))
			throw new NotFoundMTIException();
	}

	/**
	 * Define first superclass and before subscribe if exist a class overrider field
	 */
	private void defFields(Class<?> tClass) {
		if(!tClass.equals(Object.class)) {
			defFields(tClass.getSuperclass());
		}
		Field[] declaredFields = tClass.getDeclaredFields();
		for(Field field : declaredFields) {
			if(field.isAnnotationPresent(MTI.class)) {
				fieldMTI = field;
			} else if(field.isAnnotationPresent(Bit.class)) {
				Bit bit = field.getAnnotation(Bit.class);
				fieldsBit[bit.value() - 1] = field;
			}
		}
	}

	public byte[] pack(T obj)
			throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ParseException {
		try(ByteArrayOutputStream array = new ByteArrayOutputStream(0);
			DataOutputStream out = new DataOutputStream(array)) {
			// Message Type Identifier
			out.write(packMTI(obj));
			// Writer bitmap
			out.write(packBitmap(obj));
			// Writer bits
			for(int i = 0; i < 128; i++) {
				if(fieldsBit[i] == null || !fieldsBit[i].isAnnotationPresent(Bit.class)) continue;
				String value = get(fieldsBit[i].getName(), obj);
				if(value == null) continue;
				Bit bit = fieldsBit[i].getAnnotation(Bit.class);
				packBit(out, bit, value);
			}
			out.flush();
			return array.toByteArray();
		}
	}

	private void packBit(DataOutputStream out, Bit bit, String value)
			throws IOException, ParseException {
		value = dataRepresentation(value, bit.dataRepresentation());
		value = padding(value, bit.fixedLength(), bit.padding(), bit.justification(), bit.maximumLength());
		value = dataLength(value, bit.dataLength());
		LOGGER.debug(value);
		if(value.length() < bit.fixedLength())
			throw new RuntimeException("value=" + value + " value.length()=" + value.length() + " bit.fixedLength()=" + bit.fixedLength());
		out.write(value.getBytes(encode.getName()));
	}

	private byte[] packMTI(T obj)
			throws IllegalAccessException, UnsupportedEncodingException, NoSuchMethodException, InvocationTargetException {
		String string = get(fieldMTI.getName(), obj);
		string = padding(string, 4, '0', Justification.LEFT);
		LOGGER.debug(string);
		return string.getBytes(encode.getName());
	}

	private byte[] packBitmap(T obj)
			throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		boolean[] boolmap = new boolean[128];
		for( Field field : fieldsBit ) {
			if(field != null && field.isAnnotationPresent(Bit.class)) {
				Bit bit = field.getAnnotation(Bit.class);
				String ret = get(field.getName(), obj);
				boolmap[ bit.value() - 1 ] = (ret != null);
				if(ret != null && bit.value() > 64)
					boolmap[0] = true;
			}
		}
		LOGGER.debug(Arrays.toString(boolmap));
		return parseBitmap(boolmap);
	}

	private byte[] parseBitmap(boolean[] boolmap) {
		int lentgh = boolmap[0]? 16: 8;
		byte[] bitmap = new byte[lentgh];
		for(int i = 0; i< lentgh; i++) {
			bitmap[i] = 0x00;
			for(int j = 0; j < 8; j++) {
				if(boolmap[ i * 8 + j ])
					bitmap[i] |= ( 1 << ( 7 - j ) );
			}
		}
		return bitmap;
	}

	private boolean[] parseBitmap(byte[] bitmap) {
		boolean[] boolmap = new boolean[bitmap.length * 8];
		for(int i = 0; i< bitmap.length; i++) {
			for(int j = 0; j < 8; j++) {
				boolmap[ i * 8 + j ] = ( ( 1 << ( 7 - j ) ) & bitmap[i]) > 0;
			}
		}
		LOGGER.debug(Arrays.toString(boolmap));
		return boolmap;
	}

	private String get(String name, T obj)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		name = name.substring(0,1).toUpperCase().concat(name.substring(1));
		LOGGER.debug(name);
		Method method = obj.getClass().getMethod("get" + name);
		Object ret = method.invoke(obj);
		return ret != null ? String.valueOf(ret): null;
	}
	private void set(String name, T obj, Class type, byte[] value)
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, UnsupportedEncodingException {
		name = name.substring(0,1).toUpperCase().concat(name.substring(1));
		LOGGER.debug(name);
		Method method = obj.getClass().getMethod("set" + name, type);
		if(type.equals(byte[].class)) {
			LOGGER.debug(Arrays.toString(value));
			method.invoke(obj, value);
			return;
		}
		String string = new String(value, encode.getName());
		LOGGER.debug(string);
		if(type.equals(String.class)) {
			method.invoke(obj, string);
			return;
		}
		if(type.equals(Number.class)) {
			method.invoke(obj, new BigInteger(string));
			return;
		}
		throw new ClassCastException("method=" + method.getName() + " type=" + type.getName() + " stringValue=" + string);
	}

	public T unpack(byte[] buf)
			throws IllegalAccessException, InstantiationException, IOException, NoSuchMethodException, InvocationTargetException {
		T obj = type.newInstance();
		try(ByteArrayInputStream array = new ByteArrayInputStream(buf);
			DataInputStream in = new DataInputStream(array)) {
			// Message Type Identifier
			byte[] mti = new byte[4];
			read(in, -1, mti);
			unpackMTI(obj, mti);
			// Reader bitmap primary
			byte[] bitmapPrimary = new byte[8];
			read(in, 0, bitmapPrimary);
			boolean[] boolmapPrimary = parseBitmap(bitmapPrimary);
			// Reader bitmap secondary
			boolean[] boolmapSecondary = new boolean[8];
			if(boolmapPrimary[0]) {
				byte[] bitmapSecondary = new byte[8];
				read(in, 1, bitmapSecondary);
				boolmapSecondary =  parseBitmap(bitmapSecondary);
			}
			// Reader bits primary
			for (int i = 1; i < boolmapPrimary.length; i++) {
				if(!boolmapPrimary[i]) continue;
				unpackBit(in, obj, i);
			}
			// Reader bits secondary
			for (int i = 0; i < boolmapSecondary.length; i++) {
				if(!boolmapSecondary[i]) continue;
				unpackBit(in, obj, i + 64);
			}
			return obj;
		}
	}

	private void read(DataInputStream in, int bit, byte[] value)
			throws IOException {
		if(in.read(value) == -1)
			throw new IOException("End of file unexpected bit " + bit + " not found data or partial");
	}

	private void unpackBit(DataInputStream in, T obj, int i)
			throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		if( fieldsBit[i] == null || !fieldsBit[i].isAnnotationPresent(Bit.class)) return;
		Bit bit = fieldsBit[i].getAnnotation(Bit.class);
		LOGGER.debug("Bit=" + bit.value());
		int lentgh = dataLength(in, bit);
		LOGGER.debug("length=" + lentgh);
		byte[] value = new byte[lentgh];
		read(in, bit.value(), value);
		set(fieldsBit[i].getName(), obj, fieldsBit[i].getType(), value);
	}

	private void unpackMTI(T obj, byte[] mti)
			throws IllegalAccessException, UnsupportedEncodingException, NoSuchMethodException, InvocationTargetException {
		set(fieldMTI.getName(), obj, fieldMTI.getType(), mti);
	}

	public static String padding(int value, int lentgh, char padding, Justification justification) {
		return padding(value, lentgh, padding, justification, 0);
	}

	public static String padding(int value, int lentgh, char padding, Justification justification, int maximumLength) {
		return padding(String.valueOf(value), lentgh, padding, justification, maximumLength);
	}

	public static String padding(String value, int lentgh, char padding, Justification justification) {
		return padding(value, lentgh, padding, justification, 0);
	}

	public static String padding(String value, int lentgh, char padding, Justification justification, int maximumLength) {
		for(int i = value.length(); i < lentgh; i++) {
			if(justification.equals(Justification.LEFT) || (justification.equals(Justification.NONE) && padding == '0')) {
				value = padding + value;
			} else if(justification.equals(Justification.RIGHT) || (justification.equals(Justification.NONE) && padding == ' ')) {
				value = value + padding;
			}
		}
		return maximumLength > lentgh? substring(value, maximumLength): substring(value, lentgh);
	}

	private static String substring(String str, int lentgh) {
		return str.length() > lentgh? str.substring(0, lentgh): str;
	}

	protected String dataRepresentation(String value, DataRepresentation dataRepresentation)
			throws ParseException {
		value = Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		if(dataRepresentation.equals(DataRepresentation.ALPHABETIC_CHARACTERS)) {
			value = value.replaceAll("[^a-zA-Z]", "");
		} else if(dataRepresentation.equals(DataRepresentation.NUMERIC)) {
			value = value.replaceAll("[^0-9]", "");
		} else if(dataRepresentation.equals(DataRepresentation.ALPHABETIC_SPACE)) {
			value = value.replaceAll("[^a-zA-Z\\s]", "");
		} else if(dataRepresentation.equals(DataRepresentation.NUMERIC_SPACE)) {
			value = value.replaceAll("[^0-9\\s]", "");
		} else if(dataRepresentation.equals(DataRepresentation.ALPHABETIC_NUMERIC)) {
			value = value.replaceAll("[^a-zA-Z0-9]", "");
		} else if(dataRepresentation.equals(DataRepresentation.ALPHABETIC_NUMERIC_SPACE)) {
			value = value.replaceAll("[^a-zA-Z0-9\\s\\\\]", "");
		} else if(dataRepresentation.equals(DataRepresentation.YYMMDDhhmmss)) {
			value = value.replaceAll("[^0-9]", "");
			new SimpleDateFormat("yyMMddHHmmss").parse(value);
		} else if(dataRepresentation.equals(DataRepresentation.YYMMDD)) {
			value = value.replaceAll("[^0-9]", "");
			new SimpleDateFormat("yyMMdd").parse(value);
		} else if(dataRepresentation.equals(DataRepresentation.YYMM)) {
			value = value.replaceAll("[^0-9]", "");
			new SimpleDateFormat("yyMM").parse(value);
		} else if(dataRepresentation.equals(DataRepresentation.MMDD)) {
			value = value.replaceAll("[^0-9]", "");
			new SimpleDateFormat("MMdd").parse(value);
		} else if(dataRepresentation.equals(DataRepresentation.MMDDhhmmss)) {
			value = value.replaceAll("[^0-9]", "");
			new SimpleDateFormat("MMddHHmmss").parse(value);
		}
		return value;
	}

	public static String dataLength(String value, DataLength dataLength) {
		if(dataLength.equals(DataLength.LLVAR)) {
			String llvar = padding(value.length(), 2, '0', Justification.LEFT);
			value = llvar + value;
		} else if(dataLength.equals(DataLength.LLLVAR)) {
			String lllvar = padding(value.length(), 3, '0', Justification.LEFT);
			value = lllvar + value;
		}
		LOGGER.debug(value);
		return value;
	}

	protected int dataLength(DataInputStream in, Bit bit) throws IOException {
		if(bit.dataLength().equals(DataLength.LLVAR)) {
			byte[] llvar = new byte[2];
			read(in, bit.value(), llvar);
			return Integer.valueOf(new String(llvar, encode.getName()));
		} else if(bit.dataLength().equals(DataLength.LLLVAR)) {
			byte[] lllvar = new byte[3];
			read(in, bit.value(), lllvar);
			return Integer.valueOf(new String(lllvar, encode.getName()));
		}
		LOGGER.debug("dataLength=" + bit.dataLength());
		return bit.fixedLength();
	}
}
