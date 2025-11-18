package net.konic.corejava;

public class GradeCalculator {
	
	static void  CalculatorGrade(int marks) {
		if(marks>=70)
			System.out.println("A-grade");
		else if(marks>=60)
			System.out.println("B-grade");
		else if(marks>=50)
			System.out.println("C-garde");
		else
			System.out.println("fail");
	}

	public static void main(String[] args) {
		 CalculatorGrade(78);
	}
}

/*
import java.util.Scanner;

class GradeCalculator {
    static void calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) System.out.println("Grade: A");
        else if (marks >= 75) System.out.println("Grade: B");
        else if (marks >= 60) System.out.println("Grade: C");
        else System.out.println("Fail");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        calculateGrade(marks);
        sc.close();
    }
}
*/