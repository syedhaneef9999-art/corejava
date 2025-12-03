package net.konic.corejava.stati;

public class CarShowroom {
	static int count =0;
	
	    String brand;

	     CarShowroom(String b) {
	        brand = b;
	        count++; // increment when object created
	        
	    }

	    public static void main(String[] args) {
	    	CarShowroom c1 = new CarShowroom("BMW");
	        CarShowroom c2 = new CarShowroom("Audi");
	        CarShowroom c3 = new CarShowroom("Kia");

	        System.out.println("Car Created: " + c1.brand); 
	        System.out.println("Car Created: " + c2.brand); 
	        System.out.println("Car Created: " + c3.brand); 
	        System.out.println("Total Cars Sold: " + CarShowroom.count);   

	}

}
