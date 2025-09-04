package Classes_Objects;

public class Mainclass1 {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.name = "Virat";
		p1.JN = 18;
		p1.play();
		
		Player p2 = new Player();
		p2.name = "Mahi";
		p2.JN = 7;
		p2.play();
		
		Player p3 = new Player();
		p3.name = "Shubhman";
		p3.JN = 77;
		p3.play();
	}

}
class Player{
	String name;
	int JN;
	void play() {
		System.out.println(name+ " has Jersey Number "+ JN);
	}
}
