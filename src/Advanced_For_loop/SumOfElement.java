package Advanced_For_loop;

public class SumOfElement {
	public static void main(String[] args) {
		int sum =0;
		int[] arr = {10, 20, 30, 40, 50};
		for(int ele:arr) {
			sum = sum + ele;
		}
		System.out.println(sum);
	}

}
