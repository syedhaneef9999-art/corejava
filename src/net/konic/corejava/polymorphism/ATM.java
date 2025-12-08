package net.konic.corejava.polymorphism;

public class ATM {
	void withdraw(int x){
		System.out.println("Withdrawn : " + x);
		
	}
	void withdraw(double x) {
		System.out.println("Withdrawn : " + x);
	}
	void withdraw(int x,String y) {
		System.out.println(x + " from " + y +" Account");
	}

	public static void main(String[] args) {
		ATM a= new ATM();
		a.withdraw(500);
		a.withdraw(500.75);
		a.withdraw(1000, "Current");

	}

}
