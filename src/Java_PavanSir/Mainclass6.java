package Java_PavanSir;

public class Mainclass6 {
	public static void main(String[] args) {
		Utility ref = new Utility();
		System.out.println(Utility.p);
		System.out.println(ref.q);
		
		Utility.test();
		ref.play();
	}

}
class Utility{
	static int p=10;
	int q=20;
	
	static void test() {
		System.out.println("Executing test()...");
		
	}
	void play() {
		System.out.println("Executing play()...");
	}
}
