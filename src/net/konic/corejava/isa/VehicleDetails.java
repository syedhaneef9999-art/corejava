package net.konic.corejava.isa;
class Vehicle{
	void start() {
		System.out.println("Vehicle starts");
		
	}
}
 class Car extends Vehicle{
	 void start() {
		 System.out.println("Car start with key");
	 }
}
 class Bike extends Vehicle{
	 void start() {
		 System.out.println("Bike start with key");
	 }
 
}
public class VehicleDetails {
	public static void main(String[] args) {
	Car c= new Car();
	Bike b=new Bike();
	c.start();
	b.start();
	
	}	
       
}
