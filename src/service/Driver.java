package service;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import model.Account;
import model.SavingsAccount;

public class Driver {
    public static void main(String[] args) {
        AccountStore store = new AccountStore();

        Account acc1 = new SavingsAccount("User 1", 5000, 500);
        Account acc2 = new SavingsAccount("User 2", 2000, 500);
        Account acc3 = new SavingsAccount("User 3", 9000, 500);

        store.add(acc1);
        store.add(acc2);
        store.add(acc3);

        out.println("Looking up account by number " + acc2.getAccountNumber() + ":");
        Account fetched = store.get(acc2.getAccountNumber());
        out.println("Found: " + fetched);

        out.println("\nAccounts sorted by balance (descending):");
        ArrayList<Account> sorted = store.sortedByBalance();
        for (Account a : sorted) {
            out.println(a.getAccountNumber() + " - " + a.getOwnerName() + " : Rs. " + a.getBalance());
        }

        out.println("\nNatural sorting with Comparable (by account number):");
        ArrayList<Account> natural = store.getAll();
        Collections.sort(natural);
        for (Account a : natural) {
            out.println(a.getAccountNumber() + " - " + a.getOwnerName());
        }

        out.println("\nTransaction History from AccountStore:");
        for (String record : store.getTransactionHistory()) {
            out.println(record);
        }
    }
}
