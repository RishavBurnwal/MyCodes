package Java_PavanSir;
//find sum of corner and except corners
public class Corner_sum {
	public static void main(String[] args) {
		int[] arr= {14, 13, 11, 16, 12};
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(i==0 || i==arr.length-1) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
