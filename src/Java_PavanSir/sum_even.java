package Java_PavanSir;

public class sum_even {
	public static void main(String[] args) {
		int[] arr= {14, 13, 11, 16, 12};
		int Sum = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i]%2==0) {
				Sum =Sum + arr[i];
			}
			
		}
		System.out.println(Sum);
	}

}
