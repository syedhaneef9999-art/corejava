package net.konic.corejava.exceptions;

public class TryCatchNoException {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }
}
