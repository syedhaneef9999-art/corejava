package net.konic.corejava.staticnonstatic;

public class MathUtil {
	// STATIC method
    static int add(int a, int b) {
        return a + b;
    }

    // INSTANCE method
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Call static directly
        System.out.println("Add: " + MathUtil.add(5, 3));

        // For non-static → create object
        MathUtil m = new MathUtil();
        System.out.println("Multiply: " + m.multiply(5, 3));
    }
}
