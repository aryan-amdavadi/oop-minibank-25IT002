public class Driver {
    public static void main(String[] args) {
        String[] passwords = {
            "abc", "Abc123", "Harsh123", "48@48@48@", "Abcd1234!", "Password@742"
        };
        for (String pw : passwords) {
            String result = PasswordChecker.strength(pw);
            System.out.println("Password: " + pw);
            System.out.println("Strength: " + result);
            System.out.println();
        }
    }
}
