package Constructors;

public class Mainclass13 {
	public static void main(String[] args) {
		Nexon n1 = new Nexon(12);
		System.out.println("-------------------");
		Nexon n2 = new Nexon(3.7);
		System.out.println("-------------------");
		Nexon n3 = new Nexon("ABC");
		System.out.println("-------------------");
	}
}
class Nexon{
	Nexon(int a){
		System.out.println("Nexon-Petrol");
	}
	Nexon(double d){
		System.out.println("Nexon-Diesel");
	}
	Nexon(String s){
		System.out.println("Nexon-Electric");
	}
}