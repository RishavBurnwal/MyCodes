package Java_PavanSir;

public class Example2 {
	static int square(int n) {
		int sq = n*n;
		return sq;
	}
	public static void main(String[] args) {
		for(int a=0; a<=5; a++) {
			System.out.println(a + "Square : "+ square(a));
		}
	}

}
