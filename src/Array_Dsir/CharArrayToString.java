package Array_Dsir;

public class CharArrayToString {
	public static void main(String[] args) {
		char[] arr = {'j', 's', 'p', 'i', 'd', 'e', 'r', 's'};
		String s1 = "";
		for(int i=0; i<arr.length; i++) {
			s1 = s1 + arr[i];
		}
		System.out.println(s1);
		
		System.out.println("====================");
		String s2 = new String(arr);
		System.out.println(s2);
		
	}

}
