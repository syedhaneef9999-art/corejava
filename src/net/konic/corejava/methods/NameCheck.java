package net.konic.corejava.methods;

public class NameCheck {

	    String checkNameLength(String fName, String lName) {

	        String fullName = fName + " " + lName;

	        if (fullName.length() >= 10) {
	        	System.out.println("IT IS A LONG NAME");
	            return "Long Name";
	        } else {
	        	System.out.println("IT IS A SHORT NAME");
	            return "Short Name";
	        }
	    }

	public static void main(String[] args) {
		
		NameCheck nc= new NameCheck();
		nc.checkNameLength("Syed ", "H");

	}

}
