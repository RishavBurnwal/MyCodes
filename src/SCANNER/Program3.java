package SCANNER;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] argd) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		double num1 = scn.nextDouble();
		System.out.println("Enter number2 : ");
		double num2 = scn.nextDouble();
		double sum = num1 + num2;
		System.out.println("sum: " + sum);	
	}	

}
