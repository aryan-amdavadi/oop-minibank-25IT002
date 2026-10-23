public class Driver {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("Aarav", 8000, 1000);
        accounts[1] = new CurrentAccount("Diya", 15000, 5000);
        accounts[2] = new FixedDepositAccount("Kabir", 50000);

        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Type: " + account.getClass().getSimpleName());
            System.out.println("Owner: " + account.getOwnerName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest Rate: " + account.interestRate() + "%");

            if (account instanceof CurrentAccount ca) {
                System.out.println("Overdraft Limit allowed: Rs. " + ca.getOverdraftLimit());
            }

            System.out.println("Can withdraw 10000? " + account.canWithdraw(10000));
            System.out.println("----------------------------------------");
        }
    }
}