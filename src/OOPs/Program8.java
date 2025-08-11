package OOPs;

public class Program8 {
	static void connect(boolean bool) {
		System.out.println("Vakue Received: "+bool);
	}
	static void verify(char ch) {
		System.out.println("value: "+ch);
	}
	public static void main(String[] args) {
		verify('J');
		connect(true);
	}
}
