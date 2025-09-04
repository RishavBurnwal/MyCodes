package Array_Dsir;

public class MoveFront {
	public static void main(String[] args) {
		int[] arr = {3, 5, 2, 1, 9, 2, 3, 2};
		int ele = 2;
		int[] temp = new int[arr.length];
		int k =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ele) {
				temp[k] = ele;
				k++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != ele) {
				temp[k] = arr[i];
				k++;
			}
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
	}

}