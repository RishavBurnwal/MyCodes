package Java_PavanSir;

public class Minclass4 {
	public static void main(String[] args) {
		Example ex = new Example();
		System.out.println(ex.a);
		System.out.println(ex.b);
		
		ex.disp();
		ex.help();
	}
}
class Example{
	int a = 50;
	char b = 'J';
	void disp() {
		System.out.println("Execution disp()...");
	}
	void help() {
		System.out.println("Execution help()...");
	}
}
