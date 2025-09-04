package OOPs;

public class Gamma {
	int num;
	{
		num = 100;
	}
	{
		num = 200;
	}
	{
		num = 300;
	}
	
	public static void main(String[] args) {
		Gamma g = new Gamma();
		System.out.println(g.num);
	}

}
