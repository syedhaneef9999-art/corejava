package net.konic.corejava.accessmodifier;

//1) Restaurant Ordering System
public class Restaurant {

 // STATIC variable (same for all customers)
 static String restaurantName = "Tasty Bites";

 // NON-STATIC / INSTANCE variable (different for each object)
 String customerName;

 // PUBLIC parameterized constructor → sets customer name
 public Restaurant(String name) {
     customerName = name;
 }

 // DEFAULT constructor (no access modifier) → sets "Walk-in Customer"
 Restaurant() {
     customerName = "Walk-in Customer";
 }

 // PRIVATE constructor → cannot be used from outside this class
 // (only from inside this class if needed)
 private Restaurant(boolean internalUse) {
     customerName = "Internal Test Customer";
 }

 // NON-STATIC method → needs object to call
 void orderFood(int choice) {
     String item = "";
     int price = 0;

     // SWITCH to select food item
     switch (choice) {
     case 1:
         item = "Pizza";
         price = 200;
         break;
     case 2:
         item = "Burger";
         price = 150;
         break;
     case 3:
         item = "Pasta";
         price = 180;
         break;
     default:
         System.out.println("Invalid choice");
         return; 
     }

     System.out.println("Customer: " + customerName);
     System.out.println("Restaurant: " + restaurantName);
     System.out.println("Added: " + item + " (₹" + price + ")");
 }

 public static void main(String[] args) {

     // Using PUBLIC constructor
     Restaurant r1 = new Restaurant("Haneef");
     r1.orderFood(1); // Input: 1 → Pizza

     System.out.println("--------------");

     // Using DEFAULT constructor
     Restaurant r2 = new Restaurant(); // "Walk-in Customer"
     r2.orderFood(2);

     // We CANNOT do: new Restaurant(true); from outside this class
     // because that constructor is PRIVATE.
 }
}
