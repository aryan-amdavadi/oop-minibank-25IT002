package service;

import static java.lang.System.out;
import exception.BankException;
import model.Account;
import model.Command;
import model.SavingsAccount;
import model.TransactionType;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        SavingsAccount acc1 = new SavingsAccount("User A", 10000, 1000);
        SavingsAccount acc2 = new SavingsAccount("User B", 10000, 1000);

        out.println("1. Testing TransactionProcessor with thread pool:");
        TransactionProcessor processor = new TransactionProcessor(4);
        for (int i = 0; i < 20; i++) {
            final int index = i;
            processor.submit(() -> {
                try {
                    if (index % 2 == 0) {
                        acc1.deposit(100);
                    } else {
                        acc1.withdraw(50);
                    }
                } catch (BankException e) {
                    out.println("Transaction error: " + e.getMessage());
                }
            });
        }
        processor.stop();
        out.println("Transaction processor stopped. Account 1 balance: " + acc1.getBalance());

        out.println("\n2. Testing Producer-Consumer with wait/notify:");
        TransactionQueue queue = new TransactionQueue(5);
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Command cmd = new Command(TransactionType.DEPOSIT, "AC0001", i * 100);
                    queue.produce(cmd);
                    out.println("Produced transaction: " + cmd);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Command cmd = queue.consume();
                    out.println("Consumed transaction: " + cmd);
                    Thread.sleep(80);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        out.println("\n3. Testing Deadlock prevention with consistent lock ordering:");
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 50; i++) {
                    acc1.transfer(acc2, 10);
                }
            } catch (BankException e) {
                out.println("Transfer error in t1: " + e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 50; i++) {
                    acc2.transfer(acc1, 10);
                }
            } catch (BankException e) {
                out.println("Transfer error in t2: " + e.getMessage());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        out.println("Concurrent transfers completed successfully without deadlock!");
        out.println("acc1 final balance: " + acc1.getBalance());
        out.println("acc2 final balance: " + acc2.getBalance());
    }
}
