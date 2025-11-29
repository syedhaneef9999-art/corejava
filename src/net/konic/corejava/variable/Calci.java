package net.konic.corejava.variable;

/* Create a class Calculator

num1, num2 → instance variables

Write a method to read input using Scanner (local vars)

Write another method add() that returns the sum

Print result in main.*/


import java.util.Scanner;

public class Calci {
	
	int num1;
	int num2;
	 
	void readinput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the Second number");
		int b=sc.nextInt();
		
		num1=a;
		num2=b;
		sc.close();
	}
	
	int add() {
		int sum= num1+num2;
		return sum;
	}

	public static void main(String[] args) {
		Calci c=new Calci();
		c.readinput();
		int result = c.add();
		System.out.println(result);
	}

}
