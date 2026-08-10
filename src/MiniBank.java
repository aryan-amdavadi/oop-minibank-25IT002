import java.awt.image.BandedSampleModel;
import java.util.Scanner;

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

public class MiniBank {
    public static void main(String[] args) {


//        record BankInfo(String name, String branch){};
//
//        BankInfo bankInfo = new BankInfo("Aryan", "Station");
//        System.out.println(bankInfo.toString());

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {do {
            System.out.println("\n===== MiniBank Menu =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                MenuOption option = MenuOption.values()[choice - 1];

                switch (option) {
                    case OPEN_ACCOUNT ->
                            System.out.println("Open Account — to be implemented in a later lab");

                    case DEPOSIT ->
                            System.out.println("Deposit — to be implemented in a later lab");

                    case WITHDRAW ->
                            System.out.println("Withdraw — to be implemented in a later lab");

                    case TRANSFER ->
                            System.out.println("Transfer — to be implemented in a later lab");

                    case EXIT -> {
                        System.out.println("Thank you for using MiniBank!");
                        break;
                    }
                }

            } else {
                System.out.println("Invalid choice. Please enter 1 to 5.");
            }

        } while (choice != 5);

            System.out.println("Goodbye!");

            sc.close();}
    }
}
