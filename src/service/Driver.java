package service;

import static java.lang.System.out;
import model.Account;
import model.SavingsAccount;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Account account = new SavingsAccount("Shared User", 1000, 500);
        out.println("Starting balance: " + account.getBalance());

        int threadCount = 10;
        int timesPerThread = 1000;
        long amountPerDeposit = 1;
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new AccountWorker(account, timesPerThread, amountPerDeposit), "DepositWorker-" + (i + 1));
            out.println("Created thread: " + threads[i].getName() + " with state: " + threads[i].getState());
        }

        for (int i = 0; i < threadCount; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threadCount; i++) {
            threads[i].join();
            out.println("Joined thread: " + threads[i].getName() + " final state: " + threads[i].getState());
        }

        long expectedBalance = 1000 + (threadCount * timesPerThread * amountPerDeposit);
        out.println("Final Account Balance: " + account.getBalance());
        out.println("Expected Balance: " + expectedBalance);
        out.println("Thread synchronization verified: " + (account.getBalance() == expectedBalance));
    }
}
