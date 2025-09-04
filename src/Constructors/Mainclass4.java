package Constructors;

public class Mainclass4 {
	public static void main(String[] args) {
		Example ex = new Example();
		System.out.println(ex.x);
		System.out.println(ex.y);
		System.out.println(ex.z);
	}
}
class Example{
	int x;
	double y;
	char z;
	Example(){
		x=100;
		y=4.67;
		z='R';
	}
}

