public class OutOfStockException extends Exception {
    private int shortfall;

    public OutOfStockException(String item, int shortfall) {
        super("Out of stock for " + item + " (short by " + shortfall + ")");
        this.shortfall = shortfall;
    }

    public int getShortfall() {
        return shortfall;
    }
}

class Warehouse {
    private int stock = 10;

    public void issue(String item, int qty) throws OutOfStockException {
        if (qty <= 0) throw new IllegalArgumentException("Quantity must be > 0");
        if (qty > stock) throw new OutOfStockException(item, qty - stock);
        stock -= qty;
        System.out.println("Issued " + qty + " of " + item + ". Remaining: " + stock);
    }
}
