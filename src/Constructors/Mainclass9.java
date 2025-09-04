package Constructors;

public class Mainclass9 {
	public static void main(String[] args) {
		Biriyani b1 = new Biriyani(14,21);
		Biriyani b2 = new Biriyani(10);
		Biriyani b3 = new Biriyani(15,13,17);
	}
}
class Biriyani{
	Biriyani(int a){
		System.out.println("vegitable Biriyani");
	}
	Biriyani(int a, int b){
		System.out.println("Chicken Biriyani");
	}
	Biriyani(int a, int b, int c){
		System.out.println("Mutton Biriyani");
	}
}