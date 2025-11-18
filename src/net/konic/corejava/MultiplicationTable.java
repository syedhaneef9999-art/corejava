package net.konic.corejava;

public class MultiplicationTable {
	static void printtable(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n + "x" + i + "="+ (n*i));
	}
 public static void main(String[] args) {
	printtable(3);
}
}

/*
import java.util.Scanner;

class MultiplicationTable {
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}
*/

