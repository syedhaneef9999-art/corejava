package net.konic.corejava.stati;

public class BankDetails {
	
	static String bankname = "SBI";  // static variable 

    int accountNo;
    String customerName;
    double balance;
    

    // Constructor to set accountNo & name
    BankDetails(int accNo, String name) {
        accountNo = accNo;
        customerName = name;
        balance = 0; 
    }

    // deposit() method updates balance
    void deposit(double amount) {
        balance = balance + amount;
    }

	public static void main(String[] args) {
		BankDetails bd =new BankDetails(5678,"Haneef");
		bd.deposit(5000);
		System.out.println("bank :"+bankname);
		System.out.println("account No:" +bd.accountNo);
		System.out.println("customer:"+bd.customerName);
		System.out.println("balance :"+bd.balance);
		
		

	}

}
