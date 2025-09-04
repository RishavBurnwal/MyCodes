package String_PSir;

public class split {
	public static void main(String[] args) {
		String str= "Qspider jspider Pyspider Prospider";
		String[] arr= str.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
