package net.konic.corejava.variable;
/*6️ Employee Salary Program

Instance variables: name, salary

Method setDetails(name, salary)

Method getYearlySalary() → return type = double

Print result in main.*/

public class EmployeeSalary {
	 String name;
	 double salary; 

	    
	    void setDetails(String n, double s) {
	        name = n;
	        salary = s;
	    }

	    
	    double getYearlySalary() {
	        return salary * 12;
	    }

	public static void main(String[] args) {
		EmployeeSalary es=new EmployeeSalary();
		es.setDetails("Haneef", 34567.98);
		double returns=es.getYearlySalary();
		System.out.println(returns);
		

	}

}
