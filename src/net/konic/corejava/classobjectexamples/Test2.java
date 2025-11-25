package net.konic.corejava.classobjectexamples;

class Student{
	//properties/variable
	String Name;
	int Rollno;
	
	//method//behaviour
	void study(){
		
		System.out.println("student is yet to study");
		System.out.println("Name of a student :" + Name);
		System.out.println("Rollno :" + Rollno);
		
	}	
}

public class Test2 {

	public static void main(String[] args) {
		// objet
		Student st = new Student();
		st.Name="Haneef";
		st.Rollno=49;
		st.study();
	}

}
