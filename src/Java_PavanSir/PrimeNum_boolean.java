package Java_PavanSir;

public class PrimeNum_boolean {
	static boolean findPrimeNumber(int num) {
		int a=1, cnt=0;
		while(a<=num/2) {
			if(num%a==0) {
				cnt++;
			}
			a++;
		}
		if(cnt==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			boolean isPrime = findPrimeNumber(i);
			if(isPrime==true) {
				System.out.println(i);
			}
		}
	}

}
