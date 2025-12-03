package net.konic.corejava.stati;

public class ShoppingOrder {
	
	static double discount=10;
	double price;
	
	ShoppingOrder(double p) {
		
		price=p;
		
	}
double applyDiscount() {
	
	double discountAmount=price * discount/100;
	return price-discountAmount;
	
}
	public static void main(String[] args) {
		ShoppingOrder order = new ShoppingOrder(1000);
        double finalPrice = order.applyDiscount();

        System.out.println("Final Price: " + finalPrice);

	}

}
