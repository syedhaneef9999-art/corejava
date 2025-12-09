package net.konic.corejava.inheritence;
class Employee{
	String name;
	int salary;
	void details() {
		System.out.println("Name: " + name);
		System.out.println("Salary : " + salary);
	}
}

class Manager extends Employee{
	String Department;
	void details1() {
		System.out.println("dept:" + Department);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.name ="Sameer";
		m.salary= 90000;
		m.Department="IT";
		m.details();
		m.details1();
		

	}

}
