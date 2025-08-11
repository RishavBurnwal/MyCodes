package OOPs;

public class Program13 {
	static boolean help() {
		return true;
	}
	static char disp() {
		return 'J';
	}
	public static void main(String[] args) {
		char ch=disp();
		System.out.println("Returned value: "+ch);
		System.out.println("Returned value: "+help());
	}
}
