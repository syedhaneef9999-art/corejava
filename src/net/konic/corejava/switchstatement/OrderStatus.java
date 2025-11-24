package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class OrderStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order status :");
        String status= sc.next();
        
        switch(status)

        {
        case "PENDING":
            System.out.println("Your order is being packed");
            break;
        case "SHIPPED":
            System.out.println("Your order is on the way");
            break;
        case "DELIVERED":
            System.out.println("Your order has been delivered");
            break;
        default:
            System.out.println("Invalid Status");
		}
        	sc.close();

	}

}
