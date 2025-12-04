package net.konic.corejava.stati;

class Student {

    // STATIC variable
    static String collegeName = "Narayana";
    
    String name;
    int rollNo;


    void setDetails(String n, int r) {
        name = n;
        rollNo = r;
    }

    
    static void printDetails(Student s) {
        
        System.out.println("Student Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
    }

    public static void main(String[] args) {

        // Object created ONLY in main
        Student s = new Student();
        System.out.println("College Name: " + collegeName);

        s.setDetails("Haneef", 101);
        printDetails(s);
    }
}

