package com;

public class binaryToDecimal {

	public static void main(String[] args) {
		int bi = 1001;
		int dec = 0, value = 1, ld;
		while(bi > 0) {
			ld = bi % 10;
			dec = dec + ld * value;
			value = value * 2;
			bi = bi/10;
		}
		System.out.println(dec);

	}

}
