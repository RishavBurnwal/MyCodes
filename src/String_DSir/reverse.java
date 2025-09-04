package String_DSir;

public class reverse {
	public static void main(String[] args) {
		String s = "level";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);		
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome No.");
		}
		else {
			System.out.println("Not a Palindrome No.");
		}
	}

}
