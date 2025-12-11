package net.konic.corejava.isa;
class LivingBeing{
	void breathe() {
		System.out.println("Breathing....");
		
	}
}
 class Animal extends LivingBeing{
	 void sound() {
		 System.out.println("Animal makes sound");
	 }
}
 class Dog extends Animal{
	 void sound() {
		 System.out.println("Dog barks");
	 }
 
}

public class AnimalDetails {

	public static void main(String[] args) {
		Dog d= new Dog();
		
d.sound();
d.breathe();

	}

}
