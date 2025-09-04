package Classes_Objects;

public class Mainclass9 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		Laptop l2 = l1;
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
		l1.wallpaper = "Kiara.jpeg";
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
	}
}
class Laptop{
	String wallpaper = "Alia.jpeg";
}
