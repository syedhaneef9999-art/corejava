package net.konic.corejava.inheritence;

class Bank{
	void deposit() {
		System.out.println("Deposit successful");
	}
}
class Sbi extends Bank{
	void features() {
		System.out.println("unlimited atm withdrawls");
	}
}
public class BankFeatures {

	public static void main(String[] args) {
		//Sbi s=new Sbi();
		//s.deposit();
		//s.features();
		Bank b = new Sbi();   // ✔ Parent reference, child object
        b.deposit(); 

	}

}
