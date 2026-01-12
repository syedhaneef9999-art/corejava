package net.konic.corejava.exceptions;

public class TryCatchException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        System.out.println("Program continues");
    }
}

