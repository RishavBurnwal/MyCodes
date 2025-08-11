package com;

public class SpyNumber {

	public static void main(String[] args) {
		int n=22, sum=0, prod=1, rem=0;
		while(n!=0) {
			rem = n%10;
			sum = sum+rem;
			prod = prod*rem;
			n = n/10;
		}
		System.out.println(sum==prod ? "Given number is a Spy Number" : "Given Number is not a spy Number");
	}

}

//using ternary operator
//Spy Number means -> (sum of digits == product of digits)
