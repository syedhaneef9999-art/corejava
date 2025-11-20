package net.konic.corejava.operator;

import java.util.Scanner;

public class ParkingSlots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slots = 50;

        System.out.print("Cars Parked: ");
        int parked = sc.nextInt();

        System.out.print("Cars Exit: ");
        int exit = sc.nextInt();

        slots -= parked;
        slots += exit;

        System.out.println("Available Slots: " + slots);
        
        sc.close();
    }
}