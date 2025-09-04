package Classes_Objects;

public class student {
	public static void main(String[] args) {
		Sub_Student s1 = new Sub_Student();
		s1.name = "Rama";
		s1.cgpa = 8.7;
		s1.study();
		s1.write();
		System.out.println("-------------------------------");
		
		Sub_Student s2 = new Sub_Student();
		s2.name = "Krishna";
		s2.cgpa = 9.8;
		s2.study();
		s2.write();
		
	}
}
class Sub_Student{
	String name;
	double cgpa;
	void study() {
		System.out.println(name +" is studying");
	}
	void write() {
		System.out.println(name +" is writing the cgpa "+ cgpa);
	}
	
}
