public class Driver {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account("Alice", 5000);
        accounts[1] = new Account("Bob", 3000);
        accounts[2] = new Account(accounts[0].getAccountNumber(), "Alice Clone", 5000, true);

        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }

        accounts[0].deposit(1000);
        accounts[1].withdraw(500);

        System.out.println("After transactions:");
        System.out.println("Account 0: " + accounts[0]);
        System.out.println("Account 1: " + accounts[1]);

        boolean sameAccount = accounts[0].equals(accounts[2]);
        System.out.println("accounts[0].equals(accounts[2]): " + sameAccount);

        boolean diffAccount = accounts[0].equals(accounts[1]);
        System.out.println("accounts[0].equals(accounts[1]): " + diffAccount);

        Object obj = accounts[0];
        if (obj instanceof Account) {
            System.out.println("Verified object is an instance of Account");
        }

        Customer customer = new Customer("Charlie", "charlie@example.com", "9876543210");
        Customer.Address addr = new Customer.Address("123 Main St", "Ahmedabad", "380001");
        customer.setAddress(addr);

        System.out.println("Original customer: " + customer);
        Customer clonedCustomer = customer.clone();
        System.out.println("Cloned customer: " + clonedCustomer);
        System.out.println("Customer clone equality check: " + (customer != clonedCustomer));
    }
}