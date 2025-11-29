package net.konic.corejava.variable;
/*BankAccount Example

Instance variables: balance

Method deposit(int amount) → uses local variable

Method getBalance() → returns balance

Call both from main.*/

public class BankAccountExample {
	int balance;
	void deposit(int amount) {
	 balance = balance+amount;
	}
	int getBalance() {
		return balance;
	}
	
	
	public static void main(String[] args) {
		BankAccountExample bae =new BankAccountExample();
		bae.deposit(10000);
		int balance= bae.getBalance();
		System.out.println(balance);
	
	}

}
