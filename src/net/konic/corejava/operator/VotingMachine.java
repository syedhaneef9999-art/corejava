package net.konic.corejava.operator;

import java.util.Scanner;

public class VotingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votes = 0;

        System.out.print("How many votes to add? ");
        int add = sc.nextInt();

        votes += add;   

        System.out.println("Final Votes: " + votes);
        sc.close();
        
    }
}
