package Java_PavanSir;

public class Tallest_boy {
	public static void main(String[] args) {
		double[] height = {5.9, 5.5, 5.4, 5.7, 5.8, 5.6};
		double tall=height[0];
		for(int i=0; i<height.length; i++) {
			if(height[i]>tall) {
				tall = height[i];
			}
		}
		System.out.println("Tallest height: "+ tall);
	}

}
