package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class VoterEligibilty {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Age:");
		int n=sc.nextInt();
		
		if(n>18)
		{
			System.out.println("He is Eligible for vote");
		}
			
			else
			{
				System.out.println("He is not Eligible");
		}
		
           sc.close();
	}

}
