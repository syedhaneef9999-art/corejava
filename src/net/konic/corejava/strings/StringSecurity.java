package net.konic.corejava.strings;

public class StringSecurity {
	
	public static void main(String[] args) {

        String password = "admin123";
        password.concat("hack");

        System.out.println(password);
        
        password = password.concat("hack");

        System.out.println(password);
    
	}
	

}
