package net.konic.corejava.stati;

public class MobileRecharge {

 String mobileNumber;

 // Constructor sets mobileNumber
 MobileRecharge(String number) {
     mobileNumber = number;
 }

 // static method getPlan(amount)
 static String getPlan(int amount) {
     if (amount == 199) {
         return "1.5GB/day, 28 days";
     } else if (amount == 299) {
         return "2GB/day, 28 days";
     } else {
         return "Invalid Plan Amount";
     }
 }

 public static void main(String[] args) {
     MobileRecharge recharge = new MobileRecharge("9876543210");

     int amount = 199;
     String plan = MobileRecharge.getPlan(amount);

     System.out.println("Mobile: " + recharge.mobileNumber);
     System.out.println("Recharge Successful: " + plan);
 }
}

