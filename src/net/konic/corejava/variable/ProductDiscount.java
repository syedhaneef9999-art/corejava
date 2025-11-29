package net.konic.corejava.variable;

import java.util.Scanner;

/*8️⃣ Product Discount System

Instance variable: price

Method readPrice() → local Scanner

Method getDiscount() → return discounted price

Display final amount.
*/


public class ProductDiscount {
	
	    double price; // instance variable

	    // read price using Scanner
	    void readPrice() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter price: ");
	        price = sc.nextDouble();
	        sc.close();
	    }

	    // returns discounted price (10% discount)
	    double getDiscount() {
	        return price - (price * 0.10);
	    }

	    public static void main(String[] args) {
	        ProductDiscount p = new ProductDiscount();
	        p.readPrice();
	        double result = p.getDiscount();
	        System.out.println(result);
	    }
	

	
}
