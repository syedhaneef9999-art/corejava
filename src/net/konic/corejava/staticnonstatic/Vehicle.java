package net.konic.corejava.staticnonstatic;

public class Vehicle {
	
	static int wheels = 4;  
    String brand;           

    public static void main(String[] args) {

        // static = class name
        System.out.println("Wheels: " + Vehicle.wheels);

        // instance = object
        Vehicle v = new Vehicle();
        v.brand = "BMW";

        System.out.println("Brand: " + v.brand);
    }

}
