package com.tns.ifet.daytwo;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 'l';
		switch(x) {
		case 'l':
		case 'L':
			System.out.println(x+" is a letter!");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a Digit!");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " is a whitespace");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a special character!");
			break;
		default:
			System.out.println(x+" is other than Letter, Digit, Space or Special Character!");
		}
	}

}
