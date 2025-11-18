
//Largest of 3 numbers
package net.konic.corejava;
/*
import java.util.Scanner;
class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a > b && a > c)
            System.out.println(a + " is largest");
        else if(b > c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
        sc.close();
    }
}

//-------------------------------------------------Divisible by both 3 and 7
import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println("Divisible by both 3 and 7");
        } else {
            System.out.println("Not divisible by both 3 and 7");
        }

        sc.close();
    }
}

//--------------------------------------Amount divisible by 100 (ATM logic)

import java.util.*;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount % 100 == 0)
            System.out.println("Valid amount");
        else
            System.out.println("Invalid — not multiple of 100");
        sc.close();
    }
}
//---------------------------------Temperature check
import java.util.*;
class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp < 0)
            System.out.println("Freezing");
        else if(temp <= 20)
            System.out.println("Cold");
        else if(temp <= 35)
            System.out.println("Normal");
        else
            System.out.println("Hot");
        sc.close();
    }
}

//---------------------------------------------- Number of digits
import java.util.*;
class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0 && n <= 9)
            System.out.println("1 digit");
        else if(n >= 10 && n <= 99)
            System.out.println("2 digits");
        else
            System.out.println("More than 2 digits");
        sc.close();
    }
}
//------------------------Alphabet,digit,no.
import java.util.*;
class CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch))
            System.out.println("Alphabet");
        else if(Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
        sc.close();
    }
}
//------------------------------------Total, average, and grade
import java.util.*;
class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1=sc.nextInt(), m2=sc.nextInt(), m3=sc.nextInt(), m4=sc.nextInt(), m5=sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        float avg = (float) total/5;
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        if(avg >= 60)
            System.out.println("Grade: First Class");
        else if(avg >= 50)
            System.out.println("Grade: Second Class");
        else if(avg >= 35)
            System.out.println("Grade: Pass");
        else
            System.out.println("Grade: Fail");
        sc.close();
    }
}
*/

//---------------------------------Check if second is multiple of first
import java.util.*;
class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter two numbers");
        int a = sc.nextInt(), b = sc.nextInt();
        if(b % a == 0)
            System.out.println(b + " is a multiple of " + a);
        else
            System.out.println(b + " is not a multiple of " + a);
        sc.close();
    }
}

