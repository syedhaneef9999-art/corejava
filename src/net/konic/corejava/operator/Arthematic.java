package net.konic.corejava.operator;

import java.util.Scanner;

public class Arthematic{
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

			System.out.print("Enter item price: ");
	        float itemPrice = sc.nextFloat();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

			//logic 
	        float totalPrice = itemPrice * quantity;
	        float tax = totalPrice *  (float)18/100;  
	        float finalBill = totalPrice + tax;


	        System.out.println("Total Price: " + totalPrice);
	        System.out.println("Tax (18% GST): " + tax);
	        System.out.println("Final Bill Amount: " + finalBill);
	        
			sc.close();
		}
		
}

