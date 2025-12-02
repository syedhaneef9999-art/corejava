package net.konic.corejava.constructor;


class Cars {
    String brand;
    int price;

    // Parameterized constructor
    Cars(String b, int p) {
        brand = b;
        price = p;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Cars c = new Cars("Audi", 60000);

        System.out.println(c.brand);
        System.out.println(c.price);
    }
}

