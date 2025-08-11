package com;

public class Duck_Num {
	public static void main(String[] args) {
		int n = 0532;
		int rem=0, prod=1;
		while(n>0) {
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		if(prod==0) {
			System.out.println("duck Number");
		}
		else {
			System.out.println("Not a duck number");
		}
		
	}
}
