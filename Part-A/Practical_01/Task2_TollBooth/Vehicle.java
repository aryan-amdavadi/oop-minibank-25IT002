public record Vehicle(String number, String type) {
    public Vehicle {
        if (number == null || type == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
    }
}
