package net.konic.corejava.inheritence;

class Emp {

    String name;
    double salary;

    Address address;   // HAS-A relationship
    

    Emp(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address.street + ", " 
                           + address.city + ", " 
                           + address.pincode);
    }
}
class Address {

    String street;
    String city;
    int pincode;

    Address(String street, String city, int pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }
}
public class Addressdetails {

    public static void main(String[] args) {

        Address addr = new Address("MG Road", "Bangalore", 560001);

        Emp emp = new Emp("Haneef", 45000.50, addr);

        emp.showDetails();
    }
}
