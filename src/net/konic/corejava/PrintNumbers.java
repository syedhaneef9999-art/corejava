package net.konic.corejava;

class PrintNumbers {
    static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers();
    }
}
/*import java.util.Scanner;

class PrintNumbers {
    static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumbers();
        sc.close();
    }
}
*/