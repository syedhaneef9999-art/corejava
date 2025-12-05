package net.konic.corejava.accessmodifier;

// Mobile Recharge System
public class Recharge {

 // INSTANCE variable
 String mobileNumber;

 // STATIC method (no object needed)
 static void showOperator() {
     System.out.println("Operator: Jio");
 }

 // PRIVATE default constructor – cannot be used from outside
 private Recharge() {
     // blocked
 }

 // PUBLIC constructor – used to create object with mobile number
 public Recharge(String mn) {
     mobileNumber = mn;
 }

 // NON-STATIC method
 void choosePlan(int planCode) {
     String plan = "";

     switch (planCode) {
     case 1:
         plan = "1.5GB/day – 28 days";
         break;
     case 2:
         plan = "2GB/day – 28 days";
         break;
     case 3:
         plan = "2GB/day – 84 days";
         break;
     default:
         System.out.println("Invalid plan");
         return;
     }

     System.out.println("Mobile: " + mobileNumber);
     System.out.println("Selected Plan: " + plan);
 }

 public static void main(String[] args) {
	 Recharge.showOperator();

     Recharge r = new Recharge("9876543210");

     // Call NON-STATIC method
     r.choosePlan(2); 
 }
}
