import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalToll = 0;
        int bikeCount = 0, carCount = 0, truckCount = 0;
        while (true) {
            System.out.print("Enter vehicle number (or 'done'): ");
            String num = sc.next();
            if (num.equalsIgnoreCase("done")) break;
            System.out.print("Enter type (bike/car/truck): ");
            String type = sc.next().toLowerCase();
            Vehicle v = new Vehicle(num, type);
            int toll = switch (v.type()) {
                case "bike" -> { bikeCount++; yield 20; }
                case "car" -> { carCount++; yield 50; }
                case "truck" -> { truckCount++; yield 150; }
                default -> 0;
            };
            totalToll += toll;
        }
        System.out.println("Total toll: " + totalToll);
        String frequent = (bikeCount >= carCount && bikeCount >= truckCount) ? "bike" :
                (carCount >= truckCount ? "car" : "truck");
        System.out.println("Most frequent: " + frequent);
        sc.close();
    }
}
