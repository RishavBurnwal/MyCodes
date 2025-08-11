// write a java program where there is positive, negative ,neutral, where positive no. can be even or odd
package com;

public class rough {

	public static void main(String[] args) {
		int n=6;
		if(n>0) {
			System.out.println(n+" no is positive");
			if(n%2==0) {
				System.out.println("The no is even");
			}
			else {
				System.out.println("The no is odd");
			}
		}
		else if(n<0) {
			System.out.println("The no is negative");
		}
		else {
			System.out.println("The no is neutral");
		}
		

	}

}
