package net.konic.corejava.operator;

import java.util.Scanner;

public class PeopleHall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = 10;

        System.out.print("How many people entered? ");
        int entered = sc.nextInt();

        System.out.print("How many people left? ");
        int left = sc.nextInt();

        people += entered;  
        people -= left;      

        System.out.println("Final Count: " + people);
        sc.close();
        
    }
}
