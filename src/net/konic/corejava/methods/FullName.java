package net.konic.corejava.methods;

public class FullName {
	
	void add(String fname,String sname) {
		String fullname= fname + sname ;
		System.out.println("FullName:" + fullname);
		
	}

	public static void main(String[] args) {
		FullName n =new FullName();
		n.add("Syed ", "Haneef");

	}

}
