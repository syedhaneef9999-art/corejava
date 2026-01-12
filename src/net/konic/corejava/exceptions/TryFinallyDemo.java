package net.konic.corejava.exceptions;

public class TryFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } finally {
            System.out.println("Finally executed");
        }
    }
}

