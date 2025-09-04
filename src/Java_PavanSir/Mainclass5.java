package Java_PavanSir;

public class Mainclass5 {
	public static void main(String[] args) {
		Vendor v = new Vendor();
		System.out.println(v.str);
		System.out.println(v.id);
		v.play();
		v.supply();
		
	}
}
class Vendor{
	String str = "Rishav";
	int id = 101;
	
	void play() {
		System.out.println("Executing play()...");
	}
	void supply() {
		System.out.println("Executing supply()...");
	}
}
