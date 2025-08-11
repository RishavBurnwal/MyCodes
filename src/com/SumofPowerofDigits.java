package com;

public class SumofPowerofDigits {
	static int power(int base, int ex) {
		int pow=1;
		for(int i=1; i<=ex; i++) {
			pow = pow*base;
		}
		return pow;
		
	}
	public static void main(String[] args) {
		int n=1423, rem=0, sum=0, ex=2;
		while(n!=0) {
			rem = n%10;
			sum = sum + power(rem, ex);
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
