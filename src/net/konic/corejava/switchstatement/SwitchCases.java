package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter option (1-3): ");
        int option = sc.nextInt();
        
        switch(option)

        {
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
        	sc.close();
	}

}
