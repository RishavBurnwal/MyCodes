package Java_PavanSir;

public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println(alpha.p);
		System.out.println(alpha.q);
		
		alpha.help();
		alpha.read();
	}

}
class alpha{
	static char p = 'p';
	static boolean q = true;
	static void help() {
		System.out.println("Executing help()...");
	}
	static void read() {
		System.out.println("Executing read()...");
	}
}

