package net.konic.corejava.operator;

import java.util.Scanner;

public class InrementDerementExample {

	    public static void main(String[] args) {

	    	
	        Scanner sc = new Scanner(System.in);

	        // Taking a number as input
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        System.out.println("\n--- Increment Operators ---");

	        // Post-increment: value used first, then increased
	        int postInc = number++;  
	        System.out.println("Post-increment (number++) : Used value = " + postInc + ", Now number = " + number);

	        // Pre-increment: value increased first, then used
	        int preInc = ++number;   
	        System.out.println("Pre-increment (++number) : Value after increment = " + preInc);


	        System.out.println("\n--- Decrement Operators ---");

	        // Post-decrement: value used first, then decreased
	        int postDec = number--;  
	        System.out.println("Post-decrement (number--) : Used value = " + postDec + ", Now number = " + number);

	        // Pre-decrement: value decreased first, then used
	        int preDec = --number;   
	        System.out.println("Pre-decrement (--number) : Value after decrement = " + preDec);


	        System.out.println("\n--- Real Time Use Case Example ---");

	        // Simulating people entering a function hall
	        int peopleCount = 10; // 10 people already inside

	        System.out.println("Initial People Count : " + peopleCount);

	        peopleCount++; // one person enters
	        System.out.println("After one enters (peopleCount++) : " + peopleCount);

	        peopleCount--; // one person leaves
	        System.out.println("After one leaves (peopleCount--)  : " + peopleCount);

	        sc.close();
	    

	}

}
