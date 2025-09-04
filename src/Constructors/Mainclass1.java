package Constructors;

public class Mainclass1 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.val);
		d.test();
	}

}
class Demo {
	int val = 100;
	void test() {
		System.out.println("Executing test()...");
	}
}
