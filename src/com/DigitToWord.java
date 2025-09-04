package com;

public class DigitToWord {
	public static void main(String[] args) {
		String[] arr = {"Zero", "One", "Two", "Three", "Four", "five", "Six", "Seven", "Eight", "Nine"};
		int num  = 8932, rem =0;
		String ans = "";
		while(num!= 0) {
			rem = num%10;
			ans = arr[rem] + ans;
			num = num/10;
		}
		System.out.println(ans);
		
	}
}