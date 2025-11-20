package net.konic.corejava.operator;

import java.util.Scanner;

public class AssignmentOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        number += 5;
        System.out.println("After += 5: " + number);

        number -= 3;
        System.out.println("After -= 3: " + number);

        number *= 2;
        System.out.println("After *= 2: " + number);

        number /= 2;
        System.out.println("After /= 2: " + number);
        sc.close();
    }
}
