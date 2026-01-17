package net.koni.projet;

public class ATM {

    public static void main(String[] args) {

        Account account = new Account();

        double withdrawAmount = 3000; 

        try {

            account.withdraw(withdrawAmount);

        }
        catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }
    }
}

