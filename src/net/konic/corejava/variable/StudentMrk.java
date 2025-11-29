package net.konic.corejava.variable;

public class StudentMrk {

	int marks;
	
	void setmarks(int m) {
		marks=m;
	}
	String result() {
		if(marks>=35)
			return "pass";
		else 
			return "fail";
	}
	public static void main(String[] args) {
		StudentMrk sm =new StudentMrk();
		sm.setmarks(50);
		String result = sm.result();
		System.out.println(result);

	}

}
