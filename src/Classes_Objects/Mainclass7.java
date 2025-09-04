package Classes_Objects;

public class Mainclass7 {
	public static void main(String[] args) {
		Email e1 = new Email();
		e1.from = "heyboy143@gmail.com";
		e1.to = "heygirl1432@gmail.com";
		e1.compose();
		e1.readMail();
	}

}
class Email{
	String from;
	String to;
	
	void compose() {
		System.out.println("Email has sent from "+ from + " to "+ to);
	}
	void readMail() {
		System.out.println("Email has been read by "+ to);
		
	}
}
