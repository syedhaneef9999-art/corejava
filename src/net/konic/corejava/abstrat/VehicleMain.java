package net.konic.corejava.abstrat;

//ABSTRACT CLASS
abstract class Vehicle {

 // INSTANCE VARIABLE
 String brand;

 // STATIC VARIABLE
 static int wheels = 4;

 // CONSTRUCTOR (ALLOWED)
 Vehicle(String brand) {
     this.brand = brand;
     System.out.println("Vehicle constructor called");
 }

 // ABSTRACT METHOD (RULE)
 abstract void start();

 // NORMAL METHOD (ALLOWED)
 void showBrand() {
     System.out.println("Brand: " + brand);
 }

 // STATIC METHOD (ALLOWED)
 static void showWheels() {
     System.out.println("Wheels: " + wheels);
 }

 // ❌ NOT ALLOWED (examples)
 // private abstract void stop();
 // static abstract void run();
 // final abstract void speed();
}

//CHILD CLASS
class Car extends Vehicle {

 Car(String brand) {
     super(brand); // calling abstract class constructor
 }

 // MUST IMPLEMENT ABSTRACT METHOD
 @Override
 void start() {
     System.out.println("Car starts with key");
 }
}

//MAIN CLASS
public class VehicleMain {

 public static void main(String[] args) {

     // ❌ Object creation NOT allowed
     // Vehicle v = new Vehicle("BMW");

     // ✔ Parent reference, child object
     Vehicle v = new Car("BMW");

     v.start();          // abstract method
     v.showBrand();      // normal method
     Vehicle.showWheels(); // static method
 }
}
