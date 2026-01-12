package net.konic.corejava.exceptions;

public class ExceptionInFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            int b = 10 / 0;
        }
    }
}

