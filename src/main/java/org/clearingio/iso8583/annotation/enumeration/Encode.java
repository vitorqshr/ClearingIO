package org.clearingio.iso8583.annotation.enumeration;

public enum Encode {
	ASCII("ASCII"), EBCDIC("cp037");

	private String name;

	Encode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
