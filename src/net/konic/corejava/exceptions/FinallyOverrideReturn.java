package net.konic.corejava.exceptions;

public class FinallyOverrideReturn {
    public static int test() {
        try {
            return 20;
        } finally {
            return 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}

