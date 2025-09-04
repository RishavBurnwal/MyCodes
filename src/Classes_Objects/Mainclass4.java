package Classes_Objects;

public class Mainclass4 {
	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		b1.capacity = 2;
		b1.fill();
		b1.clean();
		
		Bottle b2 = new Bottle();
		b2.capacity = 5;
		b2.fill();
		b2.clean();
	}

}
class Bottle{
	double capacity;
	void fill() {
		System.out.println("the bottle has a capacity of "+ capacity);
		
	}
	void clean() {
		System.out.println("");
		
	}
}
