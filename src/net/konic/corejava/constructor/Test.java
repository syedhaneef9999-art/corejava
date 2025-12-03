package net.konic.corejava.constructor;

class Car {
    String brand; 
    int price;
    
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car(); // default constructor
        System.out.println(c.brand); 
        System.out.println(c.price);
    }
}