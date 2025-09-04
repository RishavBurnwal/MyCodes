package Classes_Objects;

public class Mainclass6 {
	public static void main(String[] args) {
		LoginPage l1 = new LoginPage();
		l1.username = "Rishav";
		l1.password = "Rishav2003";
		l1.login();
		
		LoginPage l2 = new LoginPage();
		l2.username = "Vijay";
		l2.forgotPassword();
		
	}
}
class LoginPage{
	String username;
	String password;
	 void login() {
		 System.out.println("Login success with username: "+ username + " with Password: "+ password);
	 }
	 void forgotPassword() {
		 System.out.println("Recovery link shared to email : "+ username);
	 }
}
