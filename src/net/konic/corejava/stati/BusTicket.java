package net.konic.corejava.stati;

public class BusTicket {

	    static String company = "IRCTC";
	    static int fare = 500; 

	    String passenger;

	    // constructor sets passenger name
	    BusTicket(String name) {
	        passenger = name;
	    }

	    public static void main(String[] args) {
	        BusTicket t1 = new BusTicket("Mohammed");
	        System.out.println("Passenger :" +t1.passenger);
	        System.out.println("fare:"+fare);
	        System.out.println("company:" +company);
	       
	    }
	}