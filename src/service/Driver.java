package service;

import static java.lang.System.out;
import exception.BankException;
import exception.InsufficientFundsException;
import exception.InvalidAmountException;
import model.SavingsAccount;
import util.BankSession;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Meera", 4000, 1000);
        SavingsAccount acc2 = new SavingsAccount("Rohan", 2000, 500);

        try {
            out.println("Attempting valid deposit of Rs. 1000...");
            acc1.deposit(1000);
            out.println("New balance: " + acc1.getBalance());

            out.println("Attempting invalid deposit of -500...");
            acc1.deposit(-500);
        } catch (InvalidAmountException e) {
            out.println("Caught InvalidAmountException: " + e.getMessage());
        }

        try {
            out.println("Attempting withdrawal of Rs. 7000 (exceeds balance)...");
            acc1.withdraw(7000);
        } catch (InsufficientFundsException e) {
            out.println("Caught InsufficientFundsException: " + e.getMessage());
            out.println("Reported shortfall: Rs. " + e.getShortfall());
        } catch (InvalidAmountException e) {
            out.println("Caught InvalidAmountException: " + e.getMessage());
        }

        try {
            out.println("Attempting valid transfer of Rs. 1500 from acc1 to acc2...");
            acc1.transfer(acc2, 1500);
            out.println("acc1 balance: " + acc1.getBalance() + ", acc2 balance: " + acc2.getBalance());
        } catch (BankException e) {
            out.println("Transfer failed: " + e.getMessage());
        } finally {
            out.println("End of transaction testing block.");
        }

        try (BankSession session = new BankSession("Meera")) {
            session.execute("Check balance for " + acc1.getAccountNumber());
        }
    }
}
