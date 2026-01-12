package net.konic.corejava.exceptions;

public class WrongCatchOrder {
    public static void main(String[] args) {
       /* try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Parent");
        } catch (ArithmeticException e) { 
            System.out.println("Child");
        }*/
    	
    	try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Child");
        } catch (Exception e) { 
            System.out.println("Parent");
        }
    }
}

