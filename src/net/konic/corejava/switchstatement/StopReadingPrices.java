package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class StopReadingPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter stock price: ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("Stop reading at -1");
                break;  // stops the loop
            }

            System.out.println("Stock Price: " + price);
        }
        sc.close();
    }
}

