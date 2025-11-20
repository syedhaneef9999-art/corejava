package net.konic.corejava.operator;

import java.util.Scanner;

public class BankToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int token = 100;

        System.out.print("How many tokens to issue? ");
        int count = sc.nextInt();

        if (count >= 1) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 2) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 3) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 4) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 5) {
            token++;
            System.out.println("Token: " + token);
        }

        sc.close();
    }
}
