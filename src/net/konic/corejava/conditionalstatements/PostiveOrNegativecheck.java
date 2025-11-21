package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class PostiveOrNegativecheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		if(n==0)
		{
			System.out.println("it is not a +ve or -ve number");
			System.exit(0);
		}
		
		if (n>0)
		
			System.out.println("it is a positive number");
			else
				
				System.out.println("it is a negative number");
		
		sc.close();
		
	}

}
