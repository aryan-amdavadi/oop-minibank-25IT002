public class StatsCalculator {
    public static <N extends Number> double average(N[] values) {
        if (values == null || values.length == 0) return 0.0;
        double sum = 0.0;
        for (N v : values) sum += v.doubleValue();
        return sum / values.length;
    }
}
