public class Driver {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5.0), new Rectangle(4.0, 6.0) };
        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
            System.out.printf("%-18s Area: %.2f\n", s.getName(), s.area());
        }
        System.out.printf("Total Area: %.2f\n", total);
    }
}
