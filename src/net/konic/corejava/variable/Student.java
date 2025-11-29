package net.konic.corejava.variable;

import java.util.Scanner;

public class Student {
	String fname;
	String lname;
	void Names() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name:");
		String f= sc.next();
		System.out.println("Enter Second name:");
		String l= sc.next();
		fname=f;
		lname=l;
		sc.close();
	}
	String fullname() {
		return fname +" "+lname;
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.Names();
		String fullname=s.fullname();
		System.out.println(fullname);	
		
	}

}
