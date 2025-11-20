package net.konic.corejava.operator;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (user.equals("Haneef") && pass.equals("1234"))
            System.out.println("Login Success");
        else
            System.out.println("Login Failed");
        
        sc.close();
    }
}
