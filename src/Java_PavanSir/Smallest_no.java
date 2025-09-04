package Java_PavanSir;

public class Smallest_no {
	public static void main(String[] args) {
		int[] arr = {12, 14, 10 ,17 ,15, 14};
		int small=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Array Smallest: "+ small);
	}

}

//find smallest boy and tallest boy
//find sum of corner and except corners