public class Driver {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();
        Thread prod = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) buffer.produce(i * 10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread cons = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) buffer.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        prod.start(); cons.start();
        prod.join(); cons.join();
    }
}
