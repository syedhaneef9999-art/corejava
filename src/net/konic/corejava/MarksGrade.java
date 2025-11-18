package net.konic.corejava;

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1, m2, m3, m4, m5;
        System.out.println("Enter marks for 5 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        
        int total = m1 + m2 + m3 + m4 + m5;
        float percentage = (float) total / 5;
        
        System.out.println("Total Marks        : " + total);
        System.out.println("Percentage Marks   : " + percentage + "%");

        // Pass/Fail logic
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) {
            System.out.println("Passed in all subjects");

            // Grade logic
            if (percentage >= 60)
                System.out.println("Grade              : First Class");
            else if (percentage >= 50)
                System.out.println("Grade              : Second Class");
            else
                System.out.println("Grade              : Third Class");

        } else {
            System.out.println("Failed in one or more subjects");
            if (m1 < 35) System.out.println("Failed in M1 (" + m1 + "/100)");
            if (m2 < 35) System.out.println("Failed in M2 (" + m2 + "/100)");
            if (m3 < 35) System.out.println("Failed in M3 (" + m3 + "/100)");
            if (m4 < 35) System.out.println("Failed in M4 (" + m4 + "/100)");
            if (m5 < 35) System.out.println("Failed in M5 (" + m5 + "/100)");
        }

        sc.close();
    }
}