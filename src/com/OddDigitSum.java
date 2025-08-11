package com;

public class OddDigitSum {

	public static void main(String[] args) {
		int n=67435, rem=0, sum=0;
		while(n>0) {
			rem = n%10;
			if(rem%2 != 0) {
				sum = sum + rem;
			}
			n = n/10;
		}
		System.out.println(sum);

	}

}
