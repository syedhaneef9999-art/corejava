package net.konic.corejava.methods;
 class Student {
    String name;
    int age;
    String course;


void printStudentInfo(Student s) {
    System.out.println("Name: " + s.name);
    System.out.println("Age: " + s.age);
    System.out.println("Course: " + s.course);
}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student s =new Student();
		s.name="HANEEF";
		s.age=25;
		s.course="ME";
		s.printStudentInfo(s);
		
	}

}
