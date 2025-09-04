//print all the possible subsequence palindromic substrings in a string length should be min 2 
//str -> "abbbahjhaklouyuagaa"

package String_DSir;

public class AllPalindromic_Substring {
	public static boolean isPalindrome(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev.equals(s);
	}
	public static void main(String[] args) {
		String s = "abbbahjhaklouyuagaa";
		for(int i=0; i<s.length(); i++) {
			String temp = ""+ s.charAt(i);
			for(int j =i+1; j<s.length(); j++) {
				temp = temp + s.charAt(j);
				if(isPalindrome(temp)) {
				System.out.println(temp);
				}
			}
		}
		 
	}


}
