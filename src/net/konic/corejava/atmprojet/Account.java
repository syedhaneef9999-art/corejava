package net.konic.corejava.atmprojet;

public class Account {
	
	private double balance = 10000;
	// Withdrawal method
	 public void withdraw(double amount) throws InsufficientBalanceException {

	        // Runtime Exception 
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
	        }

	        // Custom Checked Exception
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance in account");
	        }

	        // Successful withdrawal
	        balance = balance - amount;
	        System.out.println("Withdrawal Successful!");
	        System.out.println("Remaining Balance: " + balance);
	    }

}
