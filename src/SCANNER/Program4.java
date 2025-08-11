package SCANNER;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Mobile number");
		long mobileNumber=scn.nextLong();
		System.out.println("Enter Height");
		float height = scn.nextFloat();
		System.out.println("Enter Marital status (True/false)");
		boolean status=scn.nextBoolean();
		System.out.println("Contact: "+ mobileNumber);
		System.out.println("Height: "+ height);
		System.out.println("Married: "+ status);

		
	}

}
