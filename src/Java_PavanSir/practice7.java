package Java_PavanSir;

public class practice7 {
	public static void main(String [] args) {
		int[] arr= {13, 12, 15, 18, 16, 17};
		int Sum = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i]%2==0 && arr[i]%3==0) {
				Sum =Sum + arr[i];
			}
			
		}
		System.out.println(Sum);
	}

}
