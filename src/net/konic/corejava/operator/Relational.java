package net.konic.corejava.operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Relational + Logical operator
        if (marks >= 35 && marks <= 100) {
            System.out.println("Result: PASS");
        }
        if  (marks < 35 && marks >= 0) {
            System.out.println("Result: FAIL");
        }
		sc.close();
	}

}
