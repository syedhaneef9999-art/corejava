package net.konic.corejava.staticnonstatic;

public class Employee {

	 static String companyName = "Amazon";

	    int empId;
	    String empName;

	    // Constructor to set values
	    Employee(int id, String name) {
	        empId = id;
	        empName = name;
	    }

	    void showDetails() {
	        System.out.println("ID: " + empId);
	        System.out.println("Name: " + empName);
	        
	    }

	    public static void main(String[] args) {
	    	System.out.println("Company: " + Employee.companyName);
	        Employee e = new Employee(101, "Anees");
	        e.showDetails();
	    }

}
