package net.konic.corejava;
import java.util.Scanner;

public class AgeEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your category (OC / BC): ");
        String category = sc.next().toUpperCase();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (category.equals("OC")) {
            if (age >= 18 && age <= 24)
                System.out.println("Eligible (OC Category)");
            else
                System.out.println("Not Eligible (OC Category - age must be between 18 and 24)");
        }

        if (category.equals("BC")) {
            if (age >= 21 && age <= 35)
                System.out.println("Eligible (BC Category)");
            else
                System.out.println("Not Eligible (BC Category - age must be between 21 and 35)");
        }

        sc.close();
    }
}
