import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        final int snackPrice = 15;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Snack price is 15. Enter coins (ONE, TWO, FIVE, TEN):");
        while (total < snackPrice) {
            String input = sc.next().toUpperCase();
            Coin coin = Coin.valueOf(input);
            int value = switch (coin) {
                case ONE -> 1;
                case TWO -> 2;
                case FIVE -> 5;
                case TEN -> 10;
            };
            total += value;
            System.out.println("Inserted: " + value + " | Total so far: " + total);
        }
        int change = total - snackPrice;
        System.out.println("Paid. Change: " + change);
        sc.close();
    }
}
