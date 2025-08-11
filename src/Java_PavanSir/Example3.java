package Java_PavanSir;

public class Example3 {
	static int factorial(int n){
		int fact=1;
		while(n>=1) {
			fact = fact*n;
			n--;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		for(int a=1; a<=6; a++) {
			System.out.println("Factorial: "+ factorial(a));
		}
	}
}
