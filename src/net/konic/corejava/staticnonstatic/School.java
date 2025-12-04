package net.konic.corejava.staticnonstatic;

public class School {
	// instance method
    void printStudent() {
        System.out.println("Student: Haneef");
    }

    // static method
    static void printSchoolName() {
        System.out.println("School: GMHS");
    }

    public static void main(String[] args) {

        // Calling static
        School.printSchoolName();

        // Non-static 
        School s = new School();
        s.printStudent();
    }
}
