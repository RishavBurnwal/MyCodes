package Patterns;

public class pattern3 {
	public static void main(String[] args) {
		for(char i='A'; i<='E'; i++) {
			for(char j='A'; j<='E'; j++) {
				if(i>=j) {
					System.out.print(i +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();  //char + char = sum of its ASCII value
		}
	}

}
