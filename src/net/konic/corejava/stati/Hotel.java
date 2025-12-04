package net.konic.corejava.stati;
//1.Access static inside main() without class name
//2.Print values using a method
//3.Use Constructor to set room number
public class Hotel {
	
	static String hotelName = "Taj Hotel";
	int roomNumber;
	
	 /*void showDetails() {
	        System.out.println("Hotel Name: " + hotelName);
	        System.out.println("Room Number: " + roomNumber);
	    }*/

	/*
	  Hotel(int rn) {
        roomNumber = rn;
    }
	 */
	public static void main(String[] args) {
		System.out.println("Hotel Name: " + Hotel.hotelName);
		 
		Hotel h = new Hotel();
	        h.roomNumber = 101;
	        System.out.println("Room Number: " + h.roomNumber);
	    
	}

}
