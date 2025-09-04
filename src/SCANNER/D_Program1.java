package SCANNER;
import java.util.Scanner;
public class D_Program1 {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		int n1= ip.nextInt();
		int n2= ip.nextInt();
		int n3= ip.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}
		else if(n2>n3) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
	}
	

}
