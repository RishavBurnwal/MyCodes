package Array_Dsir;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		int size = ip.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ip.nextInt();
		}
		System.out.println("========================");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
