package Classes_Objects;

public class Mainclass2 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.model = "Iphone 16 pro max";
		m1.price = 1.5;
		m1.call();
		m1.message();
		
		Mobile m2 = new Mobile();
		m2.model = "Samsung S25 Ultra";
		m2.price = 2.0;
		m2.call();
		m2.message();
	}

}
class Mobile{
	String model;
	double price;
	void call() {
		System.out.println("Calling in model "+ model);
	}
	void message() {
		System.out.println("Message in "+ model + " its price is "+ price);
	}
}