package SCANNER;
import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int j=1; j<=15-s1.length(); j++){
                System.out.print(" ");
            }   
            if(x/10==0){
                System.out.println("00"+x);
            }
            else if(x/10>=10){
                System.out.println(x);
            }
            else {
                System.out.println("0"+x);        	
            }
        }
        System.out.println("================================");

	}	

}
