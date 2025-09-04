package Array_Dsir;

public class RotateArray {
//	public static void main(String[] args) {
//		int[] arr = {3,4,6,18,13,9,23,5,12};
//		int r = 1;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<r; j++) {
//				arr[j+1] = arr[j];
//				arr[j] = arr[arr.length-1];
//				arr[arr.length-1] = arr[arr.length-1];
//			}
//			System.out.println(arr);
//
//		}
//	}
	
	static void rotate(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i>=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {3,4,6,18,13,9,23,5,12};
	}
	
	

}
