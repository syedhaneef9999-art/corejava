package net.konic.corejava.operator;


import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // ------------------------------
        // 1. Arithmetic Operators
        // ------------------------------
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        // ------------------------------
        // 2. Relational Operators
        // ------------------------------
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ------------------------------
        // 3. Logical Operators
        // ------------------------------
        System.out.println("\n--- Logical Operators ---");
        boolean cond1 = (a > b);
        boolean cond2 = (a != 0);

        System.out.println("cond1 && cond2 : " + (cond1 && cond2));  // AND
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));  // OR
        System.out.println("!cond1         : " + (!cond1));          // NOT

        // ------------------------------
        // 4. Assignment Operators
        // ------------------------------
        System.out.println("\n--- Assignment Operators ---");
        int x = a; // Copying a to x

        x += 5; // x = x + 5
        System.out.println("x += 5 : " + x);

        x -= 3; // x = x - 3
        System.out.println("x -= 3 : " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2 : " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2 : " + x);

        // ------------------------------
        // 5. Conditional (Ternary) Operator
        // ------------------------------
        System.out.println("\n--- Conditional (Ternary) Operator ---");

        String result = (a > b) ? "A is greater" : "B is greater or equal";
        System.out.println("Result = " + result);

        sc.close();
    }
}