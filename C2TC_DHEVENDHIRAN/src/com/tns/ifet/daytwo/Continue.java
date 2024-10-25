package com.tns.ifet.daytwo;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<15; i++) {
			if(i%2 != 0)
				continue;
			System.out.println(i +" ");
		}
	}

}
