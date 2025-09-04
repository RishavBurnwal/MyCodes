package Classes_Objects;

public class Mainclass5 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accNum = 764377463763L;
		a1.accBal = 25000.00; 
		a1.withdraw(300.00);
		a1.deposit(5000.00);
		
		Account a2 = new Account();
		a2.accNum = 647838675474L;
		a2.accBal = 50000.00;
		a2.withdraw(10000.00);
		a2.deposit(8000.00);
		
	}

}
class Account{
	long accNum;
	double accBal;
	void withdraw(double amt) {
		accBal = accBal - amt;
		System.out.println("Withdraw from "+ accNum + ", Balance is "+ accBal);
	}
	void deposit(double amt) {
		accBal = accBal + amt;
		System.out.println("Deposit in "+ accNum + ", Balance is "+ accBal);
	}
}
