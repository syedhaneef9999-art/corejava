package net.konic.corejava.polymorphism;

public class StudentRegistration {
	
	void register(String Name) {
		System.out.println("Registered:" +Name);
	}
	void register(String Name,int age) {
		System.out.println("Registered:" +Name+","+ "Age:"+ age);
	}
	void register(String Name,int age, String city) {
		System.out.println("Registered:" +Name+","+ "Age:"+ age+","+ "city:"+ city);
	}
	
	public static void main(String[] args) {
		StudentRegistration sr= new StudentRegistration();
		sr.register("Haneef");
		sr.register("Haneef", 29);
		sr.register("Haneef", 29, "Nellore");
	}
	
}
