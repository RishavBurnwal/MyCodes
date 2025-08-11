package com;

public class Prime_number {

	public static void main(String[] args) {
		int n=2, rem=0, cnt=0;
		int i;
		for(i=1; i<=n; i++) {
			if(n%i == 0) {
				cnt++;
			}
		
		}
		
//		if(cnt==2) {
//			System.out.println(n+ " is a prime number");
//		}
//		else {
//			System.out.println(n+ " is not a prime number");
//		}
		
		System.out.println((cnt==2 ) ? "Prime number" : "not a prime number");

	}

}
