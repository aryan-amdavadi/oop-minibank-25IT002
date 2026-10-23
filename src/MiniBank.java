import java.util.Scanner;

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
        System.out.println("==========================================");
        System.out.println(info.name() + " - " + info.branch());
        System.out.println("==========================================");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n===== MiniBank Menu =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Invalid choice. Please enter 1 to 5.");
                continue;
            }

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                MenuOption option = MenuOption.values()[choice - 1];
                switch (option) {
                    case OPEN_ACCOUNT -> System.out.println("Open Account - to be implemented in a later lab");
                    case DEPOSIT -> System.out.println("Deposit - to be implemented in a later lab");
                    case WITHDRAW -> System.out.println("Withdraw - to be implemented in a later lab");
                    case TRANSFER -> System.out.println("Transfer - to be implemented in a later lab");
                    case EXIT -> System.out.println("Thank you for using MiniBank!");
                }
            } else {
                System.out.println("Invalid choice. Please enter 1 to 5.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
