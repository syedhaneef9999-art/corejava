package net.konic.corejava.operator;

import java.util.Scanner;

public class MovieEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Allowed");
        else
            System.out.println("Not Allowed");
        
        sc.close();
    }
    
}
