package net.konic.corejava.inheritence;

class Vehicle{
	String brand;
	void  showprint1() {
		System.out.println("Brand: " + brand);
	}
}
class Car extends Vehicle{
	int speed;
	void showprint2() {
		System.out.println("Speed:" + speed);
	}
}
public class VehicleClass {

	public static void main(String[] args) {
		Car c=new Car();
		c.brand= "Honda";
		c.speed=120;
		c.showprint1();
		c.showprint2();
		
		
	}

}
