package org.clearingio.iso8583.annotation.enumeration;

public enum DataRepresentation {
	ALPHABETIC_CHARACTERS, /* alphabetic characters A–Z and a–z */
	NUMERIC, /* numeric digits 0–9 */
	ALPHABETIC_SPACE, /* alphabetic characters (A–Z and a–z), and space character */
	NUMERIC_SPACE, /* numeric digits 0–9 and special characters (including space) */
	ALPHABETIC_NUMERIC, /* alphabetic (A–Z and a–z) and numeric characters */
	ALPHABETIC_NUMERIC_SPACE, /* alphabetic (A–Z and a–z), numeric, and special characters (including space) */
	BYTE, /* binary representation of data in eight-bit bytes */
	YYMMDDhhmmss,
	YYMMDD,
	YYMM,
	MMDD,
	MMDDhhmmss
}
