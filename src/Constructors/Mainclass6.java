package Constructors;

public class Mainclass6 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, 4.5);
		System.out.println("ETD : " + e1.eid);
		System.out.println("CTC : " + e1.ctc);
		System.out.println("--------------------------------");
		Employee e2 = new Employee(102, 3.4);
		System.out.println("ETD : " + e2.eid);
		System.out.println("CTC : " + e2.ctc);
	}
}
class Employee{
	int eid;
	double ctc;
	Employee(int i, double d){
		eid = i;
		ctc = d;
	}
}

