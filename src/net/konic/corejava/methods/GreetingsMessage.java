package net.konic.corejava.methods;

public class GreetingsMessage {
	String greet(String fgreet, String sname) {
		String Name= fgreet + sname;
		System.out.println(Name);
		return Name;
		
	}

	public static void main(String[] args) {
		GreetingsMessage gm= new GreetingsMessage();
		gm.greet("Hello ", "World");

	}

}
