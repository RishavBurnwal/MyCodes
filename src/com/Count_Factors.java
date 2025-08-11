package com;

public class Count_Factors {
	public static void main(String[] args) {
		int n=12, cnt=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
