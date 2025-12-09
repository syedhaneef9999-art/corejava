package net.konic.corejava.inheritence;

//parent 
class Person {
    String name;
    int age;
}
//child class
class Student extends Person {
    int rollNo;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Rahul";
        s.age = 20;
        s.rollNo = 101;
        s.printDetails();
    }
}