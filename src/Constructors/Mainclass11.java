package Constructors;

public class Mainclass11 {
	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		System.out.println("------------------");
		Amazon a2 = new Amazon(1499.0);
	}
}
class Amazon{
	Amazon(){
		System.out.println("Shopping");
	}
	Amazon(double subscription){
		System.out.println("Shopping");
		System.out.println("Music");
		System.out.println("Prime Video");
	}
}