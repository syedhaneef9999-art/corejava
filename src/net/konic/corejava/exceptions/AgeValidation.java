package net.konic.corejava.exceptions;

public class AgeValidation {
    static void checkAge(int age) {
        if (age < 18) {
           
            throw new YoungerAgeException("Age is below 18, not allowed");
        }

        
        System.out.println("Age is valid, access granted");
    }

    public static void main(String[] args) {

        try {
            
            checkAge(16);

        } catch (YoungerAgeException e) {
            
            System.out.println("Exception handled: " + e.getMessage());
        }

     
        System.out.println("Program completed");
    }
}
