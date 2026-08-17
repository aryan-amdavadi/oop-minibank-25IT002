class Account{
    final String accountNumber;
    String ownerName;
    long balance;
    boolean isActive;
    private static long accountCounter = 0;

    private static void generateAccountNumber() {
        accountCounter++;
        accountNumber = "AC" + String.format("%04d", accountCounter);
    }

    Account() {
        accountNumber = "";
        ownerName = "";
        balance = 0;
        isActive = true;
        accountCounter++;
    }
    Account(String ownerName, long balance) {
        this.accountNumber = "";
        this.ownerName = ownerName;
        this.balance = balance;
        this.isActive = true;
        accountCounter++;
    }
    Account(String ownerName) {
        this();
        this.ownerName = ownerName;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;

        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

}