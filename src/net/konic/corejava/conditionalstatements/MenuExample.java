package net.konic.corejava.conditionalstatements;

import java.util.*;

public class MenuExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Hello!");
            }
            else if(choice == 2) {
                System.out.println("Bye!");
            }
            else if(choice == 3) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice");
            }

        } while(choice != 3); 
        
        sc.close(); 
    }
}
