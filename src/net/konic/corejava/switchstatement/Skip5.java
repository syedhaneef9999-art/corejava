package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class Skip5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (1 to N): ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
