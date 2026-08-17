class Driver {
    public static void main(String[] args) {
        Account[] acc = new Account[3];
        acc[0] = new Account("John Doe", 1000);
        acc[1] = new Account("Jane Smith", 2000);
        acc[2] = new Account("Alice Johnson", 3000);

        for (Account account : acc) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner Name: " + account.getOwnerName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Active: " + account.isActive());
            System.out.println();
        }

        //deposits and withdrawals
        acc[0].deposit(500);
        acc[1].withdraw(1000);
        acc[2].deposit(1500);

        for (Account account : acc) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner Name: " + account.getOwnerName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Active: " + account.isActive());
            System.out.println();
        }
    }
}