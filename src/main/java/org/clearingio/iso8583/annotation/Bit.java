package org.clearingio.iso8583.annotation;

import org.clearingio.iso8583.annotation.enumeration.DataRepresentation;
import org.clearingio.iso8583.annotation.enumeration.Justification;
import org.clearingio.iso8583.annotation.enumeration.DataLength;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Bit {
	int value();
	DataLength dataLength() default DataLength.NONE;
	DataRepresentation dataRepresentation();
	int fixedLength() default 0;
	int minimumLength() default 0;
	int maximumLength() default 0;
	String name();
	Justification justification() default Justification.NONE;
	char padding() default 0x00;
}
