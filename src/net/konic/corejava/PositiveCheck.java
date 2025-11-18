package net.konic.corejava;

public class PositiveCheck {
	static void ispositive (int n) {
	if(n>0) {
		System.out.println("it is a postive");	
	}
	else if(n<0)
	{
		System.out.println("it is a negative");
	}
	else 
		System.out.println("it is 0");
}
	
	public static void main(String[] args) {
		ispositive(-5);
	}
}

/*
import java.util.Scanner;

class PositiveCheck {
    static void isPositive(int num) {
        if (num > 0) System.out.println(num + " is Positive");
        else if (num < 0) System.out.println(num + " is Negative");
        else System.out.println("Number is Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        isPositive(num);
        sc.close();
    }
}
*/
