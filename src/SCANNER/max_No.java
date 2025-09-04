package SCANNER;

import java.util.Scanner;

public class max_No {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num = scn.nextInt();
		int large = scn.nextInt();
		for(int i=1; i<num; i++) {
			if(num>large) {
				large=num;
			}
		}
		System.out.println("largest number: "+ large);
	}

}
