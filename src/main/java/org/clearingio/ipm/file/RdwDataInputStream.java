package org.clearingio.ipm.file;

import java.io.*;
import java.util.Iterator;

public class RdwDataInputStream extends DataInputStream implements Iterator<byte[]>, Closeable {
	private int lentgh;
	private byte[] array;

	public RdwDataInputStream(InputStream in) {
		super(in);
	}

	@Override
	public void remove() {
	}

	@Override
	public boolean hasNext() {
		try {
			lentgh = readInt();
			if(lentgh > 0) {
				array = new byte[lentgh];
				read(array);
				return true;
			}
			return false;
		} catch (EOFException eof) {
			return false;
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	@Override
	public byte[] next() {
		return array;
	}

	public int getLentgh() {
		return lentgh;
	}

	@Override
	protected void finalize() throws Throwable {
		in.close();
		super.finalize();
	}

	@Override
	public void close() throws IOException {
		in.close();
	}
}
