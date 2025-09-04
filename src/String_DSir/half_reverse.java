package String_DSir;

public class half_reverse {
	public static void main(String[] args) {
		String s = "levelup";
		String ans = "";
		int m = s.length()/2;
		for(int i=0; i<m; i++) {
			ans = ans + s.charAt(i);
		}
		for(int i = s.length()-1; i>=m; i--) {
			ans = ans + s.charAt(i);		
		}
		
		System.out.println(ans);
		
	}

}
