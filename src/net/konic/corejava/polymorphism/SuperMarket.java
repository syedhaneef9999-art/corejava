package net.konic.corejava.polymorphism;

public class SuperMarket {

	void generatebill(int amount) {
	System.out.println("Final Bill:" + amount);	
	}
	void generatebill(int amount, int discount) {
        int finalAmount = amount - (amount * discount / 100);
        System.out.println("Final Bill after discount: " + finalAmount);
    }
	void generatebill(int amount, int discount, int tax) {
        int afterDiscount = amount - (amount * discount / 100);
        int finalAmount = afterDiscount + (afterDiscount * tax / 100);
        System.out.println("Final Bill:" + finalAmount);
    }
	public static void main(String[] args) {
		SuperMarket sm=new SuperMarket();
		sm.generatebill(1000);
		sm.generatebill(1000, 10);
		sm.generatebill(1000, 10, 5);
		

	}

}
