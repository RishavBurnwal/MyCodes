package Constructors;

public class Mainclass3 {
	public static void main(string[] args) {
		Delta ref = new Delta();
		System.out.println(ref.num);
		ref.play();
	}

}
class Delta{
	int num;
	void play() {
		System.out.println("Executing play()...");
	}
	Delta(){
		System.out.println("Delta() Constructor");
		num = 25;
	}
}
