package net.konic.corejava.methods;

class Car {
 String brand;
 int price;
}


class CarFactory {

 Car createCar() {        
     Car c = new Car();   
     c.brand = "BMW";     
     c.price = 5000000;
     System.out.println("Brand: " + c.brand);
     System.out.println("Price: " + c.price);
     return c;            
 }
}

public class TestCar {

 public static void main(String[] args) {

     CarFactory factory = new CarFactory();

      factory.createCar();
     
 }
}

