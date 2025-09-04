package Array_Dsir;
public class Array_pair {
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,4,4,7,7};
		boolean flag = true;
		for(int i=0; i<arr.length; i=i+2) {
			if(arr[i]!= arr[i+1]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}

}
