package Java_PavanSir;

public class avg_sum {
	public static void main(String [] args) {
		int[] values= {13, 10, 15, 18, 16, 17};
		int sum = 0;
		for(int i=0; i< values.length; i++) {
			sum= sum + values[i];
		}
		int average = sum/values.length;
		System.out.println("Array average: "+ average);
	}
}
