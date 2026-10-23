package service;

import static java.lang.System.out;
import model.Account;
import model.SavingsAccount;
import util.AnnotationValidator;

public class Driver {
    public static void main(String[] args) {
        Account invalidAccount = new SavingsAccount("Invalid User", -1500, 1000);
        out.println("Validating invalid account with negative balance:");
        String[] errors = AnnotationValidator.validate(invalidAccount);
        for (String err : errors) {
            out.println("Error: " + err);
        }

        Account validAccount = new SavingsAccount("Valid User", 5000, 1000);
        out.println("Validating valid account:");
        String[] validErrors = AnnotationValidator.validate(validAccount);
        out.println("Errors count: " + validErrors.length);
    }
}
