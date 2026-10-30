public class Driver {
    public static void main(String[] args) {
        String[] inputs = { "10 / 0", "abc / 2", "20 / 4" };
        for (String input : inputs) {
            System.out.println("Attempting: " + input);
            try {
                String[] parts = input.split(" ");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[2]);
                if (b == 0) throw new DivideByZeroException("Denominator cannot be 0");
                System.out.println("Result: " + (a / b));
                break;
            } catch (DivideByZeroException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number entered");
            } finally {
                System.out.println("[Log] Completed operation attempt.\n");
            }
        }
    }
}
