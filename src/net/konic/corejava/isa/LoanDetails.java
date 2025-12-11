package net.konic.corejava.isa;
class BankLoan{
	void calculateEMI() {
		System.out.println("Emi of bank loan");
		
	}
}
 class HomeLoan extends BankLoan{
	 void calculateEMI() {
		 System.out.println("Cal EMI for Home Loan");
	 }
}
 class CarLoan extends BankLoan{
	 void calculateEMI() {
		 System.out.println("Calculate Emi for car loan");
	 }
 
}
public class LoanDetails {
public static void main(String[] args) {
	CarLoan cl= new CarLoan();
	cl.calculateEMI();
	HomeLoan hl=new HomeLoan();
	hl.calculateEMI();
}
}
