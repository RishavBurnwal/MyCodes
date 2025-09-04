package Java_PavanSir;

import com.Sum;

public class arraySum {
	public static void main(String[] args) {
		int[] arr= {14, 13, 11, 16, 12};
		int Sum = 0;
		for(int i=0; i< arr.length; i++) {
			Sum =Sum + arr[i];
		}
		System.out.println(Sum);
	}

}
