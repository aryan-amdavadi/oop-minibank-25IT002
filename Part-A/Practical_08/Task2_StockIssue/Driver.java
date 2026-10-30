public class Driver {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        int[] orders = { 4, -2, 8, 3 };
        for (int qty : orders) {
            try {
                wh.issue("Laptop", qty);
            } catch (OutOfStockException e) {
                System.out.println("Stock Failure: " + e.getMessage() + " [Shortfall: " + e.getShortfall() + "]");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Request: " + e.getMessage());
            }
        }
    }
}
