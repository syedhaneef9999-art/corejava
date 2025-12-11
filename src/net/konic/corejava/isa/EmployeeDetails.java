package net.konic.corejava.isa;

import java.util.Scanner;

class Person {

    String name;
    int age;

    void inputPersonDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        
    }

    void showPerson() {
        System.out.println("Person: " + name + " (" + age + ")");
    }
}

class Employee extends Person {   // IS-A Relationship

    double salary;

    void inputEmployeeDetails(Scanner sc) {
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void showEmployee() {
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        emp.inputPersonDetails(sc);   
        emp.inputEmployeeDetails(sc);  

        emp.showPerson();
        emp.showEmployee();

        sc.close();
    }
}
