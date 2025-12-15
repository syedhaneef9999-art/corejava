package net.konic.corejava.interfac;
interface Payment {
    void pay(int amount);
}
class UPI implements Payment {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard implements Payment {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

public class PaymentApp {
	 public static void main(String[] args) {

	        Payment p;

	        p = new UPI();
	        p.pay(500);

	        p = new CreditCard();
	        p.pay(1000);
	    }
}
