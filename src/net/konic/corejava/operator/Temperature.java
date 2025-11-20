package net.konic.corejava.operator;

import java.util.Scanner;

public class Temperature {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("----- Temperature Converter -----");
	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");
	        System.out.print("Choose option (1 or 2): ");
	        
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter Celsius: ");
	            double c = sc.nextDouble();
	            double f = (c * 9/5) + 32;
	            System.out.println("Fahrenheit: " + f);
	        } 
	        else if (choice == 2) {
	            System.out.print("Enter Fahrenheit: ");
	            double f = sc.nextDouble();
	            double c = (f - 32) * 5/9;
	            System.out.println("Celsius: " + c);
	        } 
	        else {
	            System.out.println("Invalid Option!");
	        }
	        sc.close();
	    }

}
