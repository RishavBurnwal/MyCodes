package Constructors;

public class Mainclass2 {
	public static void main(String[] args) {
		Sample ref = new Sample();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.d);
	}

}
class Sample{
	int a;
	boolean b;
	double d;
}
