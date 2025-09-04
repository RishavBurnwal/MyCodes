package Constructors;

public class Mainclass10 {
	public static void main(String[] args) {
		SoftwareEngineer sw1= new SoftwareEngineer(10, "Java");
		SoftwareEngineer sw2= new SoftwareEngineer("Java", 10);
	}
}
class SoftwareEngineer{
	SoftwareEngineer(int a, String s){
		System.out.println("Developer");
	}
	SoftwareEngineer(String s, int a){
		System.out.println("Test Engineer");
	}
}