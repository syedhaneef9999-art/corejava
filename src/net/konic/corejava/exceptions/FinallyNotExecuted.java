package net.konic.corejava.exceptions;

public class FinallyNotExecuted {
    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.println("Won't execute");
        }
    }
}

