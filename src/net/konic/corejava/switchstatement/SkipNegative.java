package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class SkipNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int count = sc.nextInt();

        for(int i = 1; i <= count; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num < 0) {
                continue;
            }

            System.out.println("Valid: " + num);
        }
        sc.close();
    }
}

