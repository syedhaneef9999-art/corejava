package net.konic.corejava.switchstatement;
import java.util.Scanner;

public class OddNumbersSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int limit = sc.nextInt();   

        for (int i = 1; i <= limit; i++) {

            if (i % 2 == 0) {
                continue;  // skip even numbers
            }

            switch (i) {
                case 1:
                    System.out.println("1 → ONE");
                    break;
                case 3:
                    System.out.println("3 → THREE");
                    break;
                case 5:
                    System.out.println("5 → FIVE");
                    break;
                default:
                    System.out.println(i + " → ODD NUMBER");
            }
        }
        sc.close();
    }
}


