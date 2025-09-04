package SCANNER;
import java.util.Scanner;

public class max_no_array {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
