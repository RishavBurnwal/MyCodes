package SCANNER;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("enter number:");
		int num = reader.nextInt();
		if(num%2 ==0) {
			System.out.println("even number:");
		}
		else {
			System.out.println("odd number:");
		}
	}

}
