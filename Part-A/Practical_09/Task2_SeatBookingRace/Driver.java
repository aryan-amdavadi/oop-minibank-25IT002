public class Driver {
    public static void main(String[] args) throws InterruptedException {
        CinemaBooking cinema = new CinemaBooking();
        Thread[] buyers = new Thread[8];
        for (int i = 0; i < buyers.length; i++) {
            final String user = "User-" + (i + 1);
            buyers[i] = new Thread(() -> cinema.bookSeat(user));
            buyers[i].start();
        }
        for (Thread t : buyers) t.join();
    }
}
