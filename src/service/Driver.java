package service;

import static java.lang.System.out;
import model.Account;
import model.SavingsAccount;
import model.CurrentAccount;
import model.FixedDepositAccount;
import model.WithdrawRule;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Dev Patel", 20000, 2000);
        out.println("Savings Account: " + sa);
        out.println("Yearly Interest: Rs. " + sa.yearlyInterest());

        WithdrawRule anonRule = new WithdrawRule() {
            public boolean allow(Account account, long amount) {
                return account.getBalance() - amount >= 1000;
            }
        };

        WithdrawRule lambdaRule = (account, amount) -> account.getBalance() >= amount;

        out.println("Anonymous rule allowed (5000): " + anonRule.allow(sa, 5000));
        out.println("Lambda rule allowed (25000): " + lambdaRule.allow(sa, 25000));

        sa.deposit(3000);
        out.println("After deposit balance: " + sa.getBalance());
        boolean withdrawn = sa.withdraw(5000);
        out.println("Withdrawal success: " + withdrawn);
        out.println("Remaining balance: " + sa.getBalance());
    }
}
