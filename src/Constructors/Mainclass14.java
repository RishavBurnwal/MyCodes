package Constructors;

public class Mainclass14 {
	public static void main(String[] args) {
		Iphone i1 = new Iphone(10);
		Iphone i2 = new Iphone(3.7);
		Iphone i3 = new Iphone("ABC");
	}
}
class Iphone{
	Iphone(int a){
		System.out.println("Iphone");
	}
	Iphone(double d){
		System.out.println("Iphone pro");
	}
	Iphone(String s){
		System.out.println("Iphone pro max");
	}
	
}