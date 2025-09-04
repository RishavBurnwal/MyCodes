package Constructors;

public class Mainclass7 {
	public static void main(String[] args) {
		Product p = new Product(2245, 4500.0, 4.2);
		System.out.println("PID : "+ p.pid);
		System.out.println("Price : "+ p.price);
		System.out.println("rating : "+ p.rating);
	}
}
class Product{
	int pid;
	double price;
	double rating;
	Product(int pid, double price, double rating){
		this.pid = pid;
		this.price = price;
		this.rating = rating;
	}
}