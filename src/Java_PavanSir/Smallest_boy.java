package Java_PavanSir;

public class Smallest_boy {
	public static void main(String[] args) {
		double[] height = {5.9, 5.5, 5.4, 5.7, 5.8, 5.6};
		double small=height[0];
		for(int i=0; i<height.length; i++) {
			if(height[i]<small) {
				small = height[i];
			}
		}
		System.out.println("Smallest height: "+ small);
	}

}
