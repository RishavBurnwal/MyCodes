import java.util.*;
package String_DSir;

public class removeSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1="";
		int l=s.length();
		for(int i=0;i<l;i++) {
			if(s.charAt(i)==' ')
				s1+=s.charAt(i);
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
		

	}

}
