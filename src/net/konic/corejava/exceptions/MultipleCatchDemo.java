package net.konic.corejava.exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Math error");
        } catch (NullPointerException e) {
            System.out.println("Null error");
        }
    }
}

