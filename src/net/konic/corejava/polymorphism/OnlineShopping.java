package net.konic.corejava.polymorphism;

public class OnlineShopping {
	
	void addToCart(int id) {
		System.out.println("Product " +id+ " added to cart");
	}
	void addToCart(int id, int quantity) {
		System.out.println("Product " + id+ " add with quantity " + quantity);
	}
	void addToCart(String name) {
		System.out.println(name + " added to cart");
	}
	
	public static void main(String[] args) {
		OnlineShopping os=new OnlineShopping();
		os.addToCart(101);
		os.addToCart(101, 3);
		os.addToCart("Earphones");

	}

}
