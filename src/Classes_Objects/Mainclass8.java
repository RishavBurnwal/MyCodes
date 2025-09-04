package Classes_Objects;

public class Mainclass8 {
	public static void main(String[] args) {
		
		Cricketer p1 = new Cricketer();
		Cricketer p2 = new Cricketer();
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1.name = "Rohit";
		System.out.println(p1.name);
		System.out.println(p2.name);
	}
}
class Cricketer{
	String name = "Kohli";
	
}