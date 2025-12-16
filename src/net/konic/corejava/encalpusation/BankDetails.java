package net.konic.corejava.encalpusation;
/*Question:
Create a BankAccount class with private balance.
Allow setting balance only if value ≥ 0.

Input:

Enter Balance: 5000

Output:

Balance is: 5000*/

class BankAccount{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance >=0) {
		this.balance = balance;	
		}
		
	}
	
}

public class BankDetails {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(5000);
		double bal = bankAccount.getBalance();
	System.out.println("Balance is " + bal);

	}

}
