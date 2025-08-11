package com;

public class StrongNum {
	static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int n=145, rem=0, sum=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			sum = sum + factorial(rem);
			n=n/10;
		}
		if(temp == sum) {
			System.out.println(temp + " is a strong number");
		}
		else {
			System.out.println(temp + " is not a strong number");
		}
	}

}
