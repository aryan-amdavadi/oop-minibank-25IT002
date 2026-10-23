public class Driver {
    public static void main(String[] args) {
        System.out.println("Valid Mobile (9876543210): " + Validator.isValidMobile("9876543210"));
        System.out.println("Invalid Mobile (12345): " + Validator.isValidMobile("12345"));

        System.out.println("Valid Email (user@bank.com): " + Validator.isValidEmail("user@bank.com"));
        System.out.println("Invalid Email (user@): " + Validator.isValidEmail("user@"));

        System.out.println("Valid PAN (ABCDE1234F): " + Validator.isValidPan("ABCDE1234F"));
        System.out.println("Invalid PAN (12345ABCDE): " + Validator.isValidPan("12345ABCDE"));

        System.out.println("Valid IFSC (HDFC0001234): " + Validator.isValidIfsc("HDFC0001234"));
        System.out.println("Invalid IFSC (HDFC123): " + Validator.isValidIfsc("HDFC123"));

        String inputCommand = "DEPOSIT AC0001 500";
        Command command = CommandParser.parse(inputCommand);
        if (command != null) {
            System.out.println("Command Type: " + command.type());
            System.out.println("Command Account Number: " + command.accountNumber());
            System.out.println("Command Amount: " + command.amount());
        }

        Account account = new Account("Pooja Shah", 12500);
        String statement = StatementFormatter.buildStatement(account);
        System.out.println(statement);
    }
}