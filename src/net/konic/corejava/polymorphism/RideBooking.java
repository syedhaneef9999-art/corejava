package net.konic.corejava.polymorphism;

public class RideBooking {
	void bookRide(String city1,String city2) {
		System.out.println("Ride booked from "+city1+ " to "+city2);
	}
void bookRide(String city1,String city2,String brand) {
	System.out.println(brand +" ride booked from "+city1+ " to " +city2 );	
	}
void bookRide(String city1,String city2, int count) {
	System.out.println("ride booked for "+ count+ " passenger from "+city1+ " to " +city2);
}
	 public static void main(String[] args) {
		RideBooking rb= new RideBooking();
		rb.bookRide("Santhapet", "IT city");
		rb.bookRide("Santhapet", "IT city", "SUV");
		rb.bookRide("Santhapet", "IT city", 3);
	}

}
