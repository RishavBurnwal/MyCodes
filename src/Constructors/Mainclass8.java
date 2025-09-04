package Constructors;

public class Mainclass8 {
	public static void main(String[] args) {
		City c1 = new City("ABC");
		City c2 = new City(3.7);
		City c3 = new City(100);
	}
}
class City{
	City(int a){
		System.out.println("New York");
	}
	City(double d){
		System.out.println("London");
	}
	City(String s){
		System.out.println("Paris");
	}
}
