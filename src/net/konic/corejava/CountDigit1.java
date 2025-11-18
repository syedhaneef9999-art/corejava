package net.konic.corejava;

public class CountDigit1 {
	static void countDigits(int num) {
		int count=0;
		
		while(num < 0)
		{
			count++;
			num /=10;
		}
		System.out.println("Digit ount = "+ count);
	}
	public static void main(String[] args) {
		countDigits(7896);

	}

}


/*
import java.util.Scanner;

public class CountDigits {

    static void countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Digit count = " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Scanner created

        System.out.print("Enter a number: ");
        int number = sc.nextInt();             // User input

        countDigits(number);                   // Method call
    }
}
*/