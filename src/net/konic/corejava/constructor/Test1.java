package net.konic.corejava.constructor;

class Car1 {
    String brand;
    int price;
 // 0-parameter constructor
    Car1() {
        brand = "BMW";
        price = 50000;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        System.out.println(c.brand);
        System.out.println(c.price);
    }
}
