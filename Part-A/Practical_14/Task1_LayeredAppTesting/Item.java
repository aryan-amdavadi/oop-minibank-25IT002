public record Item(String id, String name, double price) {
    public Item {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("ID cannot be empty");
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
    }
}
