package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter option (1-4): ");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("Data Pack Selected");
			break;
		case 2:
			System.out.println("SMS Pack Selected");
			break;
		case 3:
			System.out.println("Talktime Selected");
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option");
		}
System.out.println("hi");
		sc.close();
	}

}
