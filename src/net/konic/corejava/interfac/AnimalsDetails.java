package net.konic.corejava.interfac;

interface Animal {
    void sound();   // abstract method
}
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}
public class AnimalsDetails {
	public static void main(String[] args) {
	Animal a= new Dog();
	a.sound();

	}

}
