package Advanced_For_loop;

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = {6, 7, 12, 54, 35};
		int max = arr[0];
		int i=0;
		for(int ele:arr) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println(max);
	}

}
