package net.konic.corejava.classobjectexamples;

class Car{
	//properties/variable
	String brand;
	String color;
	
	//method//behaviour
	void starts(){
		
		System.out.println("Car is yet to start");
		System.out.println("brand :" + brand);
		System.out.println("color :" + color);
		
	}	
}



public class Test1 {

	public static void main(String[] args) {
		//object 
		Car c1=new Car();
		c1.brand="Maruti";
		c1.color="White";
		c1.starts();
		

	}

}
