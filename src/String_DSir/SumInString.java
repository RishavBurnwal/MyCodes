//Sum of digits in String.
//str -> "hi12 bye88 hello32"
//o/p-> 24 
//expl- 1+2+8+8+3+2

package String_DSir;
public class SumInString {
	public static void main(String[] args) {
		String str = "hi12 bye84 hello32";
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <='9') {
				sum = sum + (ch-48);
			}
				
		}
		System.out.println(sum);
	}

}
