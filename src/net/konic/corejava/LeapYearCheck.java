package net.konic.corejava;

public class LeapYearCheck {
	static void leapyear(int year)
	{
		if(year% 400==0)
			System.out.println("it is a leap year");
		
		else 
			
			System.out.println("not a leap year");
	}

	public static void main(String[] args) {
		leapyear(2005);
	}
}
/*
import java.util.Scanner;

class LeapYearCheck {
    static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        isLeapYear(year);
        sc.close();
    }
}
*/