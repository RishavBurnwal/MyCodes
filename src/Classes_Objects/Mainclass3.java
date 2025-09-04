package Classes_Objects;

public class Mainclass3 {
	public static void main(String[] args) {
		Bike ktm = new Bike();
		ktm.cc = 390;
		ktm.mileage = 14.0;
		ktm.drive();
		
		Bike RE = new Bike();
		RE.cc = 650;
		RE.mileage = 16.0;
		RE.drive();
		
		Bike SP = new Bike();
		SP.cc = 100;
		SP.mileage = 60.0;
		SP.drive();
	}

}
class Bike{
	int cc;
	double mileage;
	void drive() {
		System.out.println("Driving bike with "+ cc+ " and mileage "+ mileage);
	}
}
