package net.konic.corejava.hasa;
class Engine{
	void startEngine() {
		System.out.println("Engine Started");
	}
}
class Car{
	Engine engine;
	Car() {
        engine = new Engine();  
    }
	void move() {
		engine.startEngine();
		System.out.println("Car is moving");
	}
}

public class CarDetails {

	public static void main(String[] args) {
		Car c=new Car();
		c.move();

	}

}
