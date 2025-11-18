package net.konic.corejava;

class FindMax {
    static void findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Largest number is " + max);
    }

    public static void main(String[] args) {
        findMax(10, 25, 15); // static values
    }
}

/*import java.util.Scanner;

class FindMax {
    static void findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Largest number is " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findMax(a, b, c);
        sc.close();
    }
}
*/