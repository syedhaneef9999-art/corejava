package net.konic.corejava;

public class HelloStudents {
    static void printHello() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Students");
        }
    }

    public static void main(String[] args) {
        printHello();
    }
}


/*import java.util.Scanner;

class HelloStudents {
    static void printHello() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Students");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHello();
        sc.close();
    }
}
*/