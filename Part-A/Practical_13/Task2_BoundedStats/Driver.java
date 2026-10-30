public class Driver {
    public static void main(String[] args) {
        Integer[] intArr = { 10, 20, 30, 40 };
        Double[] dblArr = { 1.5, 2.5, 3.5 };
        Long[] lngArr = { 100L, 200L, 300L };
        System.out.printf("Integer Average: %.2f\n", StatsCalculator.average(intArr));
        System.out.printf("Double Average: %.2f\n", StatsCalculator.average(dblArr));
        System.out.printf("Long Average: %.2f\n", StatsCalculator.average(lngArr));
    }
}
