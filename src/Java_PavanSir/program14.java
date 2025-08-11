package Java_PavanSir;

public class program14 {
	static boolean verify(int args) {
		if(args%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean val = verify(15);
		System.out.println("Returned value: "+ val);
		System.out.println("Returned value: "+ verify(16));
	}

}
