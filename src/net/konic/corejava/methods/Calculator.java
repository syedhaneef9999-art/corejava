package net.konic.corejava.methods;
//Method WITH return type & WITH parameters
public class Calculator {

    int add(int x, int y) {
        int z = x + y;
        System.out.println(z);
        return z;
    }

    int multiply(int x, int y) {
        int z = x * y;
        System.out.println(z);
        return z;
    }

    double divide(double x, double y) {
        double z =  x / y;
        System.out.println(z);
        return z;
    }

    int subtract(int x, int y) {
        int z = x - y;
        System.out.println(z);
        return z;
    }

    int modulus(int x, int y) {
        int z = x % y;
        System.out.println(z);
        return z;
    }

    boolean isGreaterOrEqual(int x, int y) {
        boolean z = x >= y;
        System.out.println(z);
        return z;
    }

    boolean isLessOrEqual(int x, int y) {
        boolean z = x <= y;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(5, 2);
        c.multiply(5, 2);
        c.divide(10, 3);
        c.subtract(10, 6);
        c.modulus(10, 3);
        c.isGreaterOrEqual(10, 5);
        c.isLessOrEqual(3, 7);
    }
}
