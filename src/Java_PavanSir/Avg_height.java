package Java_PavanSir;

public class Avg_height {
	public static void main(String[] args) {
		double[] height= {5.11, 5.10, 5.11, 5.7, 5.8, 5.6};
		double sum=0.0;
		for(int i=0; i<height.length; i++) {
			sum = sum + height[i];
		}
		double average= sum/height.length;
		System.out.println("Average height: "+ average);
	}

}
