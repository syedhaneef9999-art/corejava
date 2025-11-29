package net.konic.corejava.variable;
/*
 * 4 Even/Odd Checker
 * 
 * Instance variable: number
 * 
 * Method readNumber() → reads input (local var)
 * 
 * Method isEven() → returns boolean
 * 
 * Use returned value in main to print EVEN/ODD.
 */

import java.util.Scanner;

public class EvenOdd {

 
    int number;

    // METHOD WITH LOCAL VARIABLE
    void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int temp = sc.nextInt();   

        number = temp; 
        sc.close();
    }

    // METHOD WITH RETURN TYPE
    boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        EvenOdd eo = new EvenOdd();
        eo.readNumber(); // user input

        boolean result = eo.isEven();

        if(result)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}
