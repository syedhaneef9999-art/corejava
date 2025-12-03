package net.konic.corejava.constructor;

public class EmployeeSalary {
	String name;
	int salary;
	
	EmployeeSalary(String n, int s){
		name= n;
		salary =s;
	}
   double yearlySalary() {
	   return salary *12;
	   
   }
	public static void main(String[] args) {
		EmployeeSalary es= new EmployeeSalary("Aisha",30000);
		System.out.println("Employee:" + es.name);
		System.out.println("Monthly salary :" +es.salary);
		System.out.println("Yearly Salary:" + es.yearlySalary());

	}

}
