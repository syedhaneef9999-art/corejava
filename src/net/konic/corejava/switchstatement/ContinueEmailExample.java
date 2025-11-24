package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class ContinueEmailExample {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of emails: ");
	        int n = sc.nextInt();

	        for(int i = 1; i <= n; i++) {
	            System.out.print("Enter email: ");
	            String email = sc.next();

	            if(!email.contains("@")) {
	                continue;   // skip invalid email
	            }

	            System.out.println("Valid: " + email);
	        }
	        sc.close();
	    }
	}

