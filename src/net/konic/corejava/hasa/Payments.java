package net.konic.corejava.hasa;
class PaymentDetails{
	String Method;
	int amount;
	void display() {
		System.out.println("Payment Method :" + Method);
		System.out.println("Amount :" +amount);
	}
}
class Order{
	PaymentDetails payment;
	Order(PaymentDetails payment){
		this.payment=payment;
	}
	 void display() {
		 System.out.println("Order Placed successfully");
		 payment.display();
	 }
}
public class Payments {

	public static void main(String[] args) {
		PaymentDetails pd= new PaymentDetails();
		pd.amount=550;
		pd.Method="UPI";
		
		Order order = new Order(pd);
		order.display();
		

	}

}
