package Java_PavanSir;

public class Mainclass3 {
	public static void main(String[] args) {
		System.out.println(new Delta().x);
		new Delta().test();
	}
}
	class Delta{
		int x = 143;
		void test() {
			System.out.println("Executing test()...");
		}
	}


