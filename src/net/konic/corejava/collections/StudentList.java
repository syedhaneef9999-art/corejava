package net.konic.corejava.collections;

import java.util.List;

public class StudentList {
	 public static List<String> addStudents() {
	        return List.of("Ayaan", "Rahim", "Sara", "John", "Ali");
	    }
	// Q2. Get Student by Index
	    public static String getStudentByIndex(int index) {
	        List<String> students = addStudents();
	        return students.get(index);
	    }

	    // Q3. Count Students
	    public static int countStudents() {
	        List<String> students = addStudents();
	        return students.size();
	    }

	    // Q4. Check Student Exists
	    public static boolean checkStudentExists(String name) {
	        List<String> students = addStudents();
	        return students.contains(name);
	    }
	 public static void main(String[] args) {
	        List<String> students = addStudents();
	        System.out.println("Students: " + students);
	        
	        //2
	        
	        System.out.println("Student at index 2: " + getStudentByIndex(2));
	        //3
	        System.out.println("Total Students: " + countStudents());
	        //4
	        if (checkStudentExists("argu")) {
	            System.out.println("Student Found");
	        } 
	        else 
	        {
	            System.out.println("Student Not Found");
	        }
	    
	    }	
}
