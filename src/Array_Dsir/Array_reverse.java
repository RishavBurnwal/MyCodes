package Array_Dsir;

public class Array_reverse {
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 4, 3, 6};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int a=0; a<arr.length; a++ ) {
			System.out.print(arr[a]);
		}
	}

}
