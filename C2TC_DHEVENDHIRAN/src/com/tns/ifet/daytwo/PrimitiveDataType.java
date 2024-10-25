package com.tns.ifet.daytwo;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteMax = 123;
		byte byteMin = -128;
		System.out.println("Min  range of byte is: "+byteMin+", Max range of byt is: "+byteMax);
		short shortMax = 32767;
		short shortMin = -32767;
		System.out.println("Minshort range of byte is "+shortMin+", Maxshort range of byte is "+shortMax);
		int maxInt = 2147483647;
		int minInt = -2147483647;
		System.out.println("Minint range of byte is "+minInt+", Maxint range of byte is "+maxInt);
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775807L;
		System.out.println("Minlong range of byte is "+minLong+", Maxlong range of byte is "+maxLong);
		float f = 3234.141243278345f;
		double d = 3456.14124512345678902345678914f;
		System.out.println("Float value is "+f+", Double value is "+d);
		boolean flag = false;
		System.out.println("Boolean value is "+flag);
	}

}
