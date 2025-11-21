package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();              // Read marks from user

        if (marks >= 35) {    // First condition → Pass

            if (marks >= 75) {    // Second condition → Distinction
                System.out.println("Pass with Distinction");
            } else {
                System.out.println("Pass");
            }

        } else {
            System.out.println("Fail");
        }

        sc.close(); 
    }
}
