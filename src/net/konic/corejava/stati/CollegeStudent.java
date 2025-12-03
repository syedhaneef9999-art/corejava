package net.konic.corejava.stati;

public class CollegeStudent {
	
	static String CollegeName = "JNTU ANANTAPUR";
	String name;
	int rollno;
	 
	CollegeStudent(String n, int r){
		name=n;
		rollno=r;
	}
	
	// Static method to change college
    static void changeCollege(String newCollege) {
        CollegeName = newCollege;
    }


	public static void main(String[] args) {
		CollegeStudent ss= new CollegeStudent("Zara",12);
		CollegeStudent.changeCollege("IIT delhi");
		System.out.println("CollegeName :" +CollegeName);
		System.out.println("Student:" +ss.name);
		System.out.println("Roll no:" +ss.rollno);

	}

}
