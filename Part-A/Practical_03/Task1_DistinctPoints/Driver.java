public class Driver {
    public static void main(String[] args) {
        Point[] points = {
            new Point(1, 2), new Point(3, 4),
            new Point(1, 2), new Point(5, 6), new Point(3, 4)
        };
        int distinctCount = 0;
        for (int i = 0; i < points.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) distinctCount++;
        }
        System.out.println("Total Points: " + points.length);
        System.out.println("Distinct: " + distinctCount);
    }
}
