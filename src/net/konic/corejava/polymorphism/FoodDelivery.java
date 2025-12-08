package net.konic.corejava.polymorphism;

public class FoodDelivery {
	void order(String name) {
		System.out.println("Order placed:" + name + " (1 qty)");
	}
void order(String name, int qty) {
		System.out.println("Order placed:" + name +" "+  qty +" qty");
	}
void order(String item, int qty, boolean spicy) {
    if (spicy) {
        System.out.println("Order placed: " + item + " (" + qty + " qty, Spicy)");
    } else {
        System.out.println("Order placed: " + item + " (" + qty + " qty, Non-Spicy)");
    }
}
	

	public static void main(String[] args) {
		FoodDelivery fd=new FoodDelivery();
		fd.order("Biriyani");
		fd.order("Biriyani", 3);
		fd.order("Biriyani",3,true);
	}

}
