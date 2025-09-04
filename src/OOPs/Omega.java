package OOPs;

public class Omega {
	char val;
	{
		System.out.println("Executing non-static initialization block-1");
		val = 'A';
	}
	{
		System.out.println("Executing non-static initialization block-2");
		val = 'B';
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Omega o = new Omega();
		System.out.println(o.val);
		System.out.println("Program Ends");
	}

}
