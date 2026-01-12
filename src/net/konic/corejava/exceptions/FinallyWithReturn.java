package net.konic.corejava.exceptions;

public class FinallyWithReturn {
    public static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally runs");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}

