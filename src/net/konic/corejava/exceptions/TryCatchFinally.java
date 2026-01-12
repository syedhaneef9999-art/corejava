package net.konic.corejava.exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Cleanup done");
        }
    }
}

