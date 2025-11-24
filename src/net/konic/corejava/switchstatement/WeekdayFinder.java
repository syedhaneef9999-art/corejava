package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class WeekdayFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter option (1-7): ");
        int option = sc.nextInt();
        
        switch(option)

        {
        case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Option");
		}
        	sc.close();

	}

}
