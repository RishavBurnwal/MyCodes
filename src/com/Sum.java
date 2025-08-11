package com;

public class Sum {

	public static void main(String[] args) {
		int n =10, sum =0;
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.print(i+ " ");
				sum = sum + i;
			}
			else {
				System.out.print(i+"+" );
				sum = sum + i;
			}
		}
		System.out.println("= " +sum);

	}

}
