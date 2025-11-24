package net.konic.corejava.switchstatement;

import java.util.Scanner;

public class Breakat5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number at which loop should break: ");
        int stop = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            if(i == stop) {
                break;
            }
            System.out.println(i);
        }
        sc.close();

}
}