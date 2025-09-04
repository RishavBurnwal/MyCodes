package SCANNER;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter any Number");
        int rem = 0;
        int n = ip.nextInt();
        while(n!=0){
            rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
}
