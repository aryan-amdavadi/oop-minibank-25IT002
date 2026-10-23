package service;

import static java.lang.System.out;
import java.util.Scanner;
import model.TransactionType;

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

record BankInfo(String name, String branch) {}

public class MiniBank {
    public static void main(String[] args) {
        BankInfo info = new BankInfo("MiniBank", "Downtown Branch");
        out.println("==========================================");
        out.println(info.name() + " - " + info.branch());
        out.println("==========================================");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            out.println("\n===== MiniBank Menu =====");
            out.println("1. Open Account");
            out.println("2. Deposit");
            out.println("3. Withdraw");
            out.println("4. Transfer");
            out.println("5. Exit");
            out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                out.println("Invalid choice. Please enter 1 to 5.");
                continue;
            }

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                MenuOption option = MenuOption.values()[choice - 1];
                switch (option) {
                    case OPEN_ACCOUNT -> out.println("Open Account - to be implemented in a later lab");
                    case DEPOSIT -> out.println("Deposit - to be implemented in a later lab");
                    case WITHDRAW -> out.println("Withdraw - to be implemented in a later lab");
                    case TRANSFER -> out.println("Transfer - to be implemented in a later lab");
                    case EXIT -> out.println("Thank you for using MiniBank!");
                }
            } else {
                out.println("Invalid choice. Please enter 1 to 5.");
            }
        }

        out.println("Goodbye!");
        scanner.close();
    }
}
