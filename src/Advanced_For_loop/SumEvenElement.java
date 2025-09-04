package Advanced_For_loop;

public class SumEvenElement {
	public static void main(String[] args) {
		int sum =0;
		int[] arr = {3, 5, 6, 8, 15, 14};
		for(int ele:arr) {
			if(ele % 2 == 0) {
				sum = sum + ele;
			}
		}
		System.out.println(sum);
	}
}
