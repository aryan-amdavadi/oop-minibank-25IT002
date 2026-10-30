public class CinemaBooking {
    private int seatsLeft = 5;

    public synchronized boolean bookSeat(String customer) {
        if (seatsLeft > 0) {
            System.out.println("Seat booked for " + customer + " | Seats remaining: " + (--seatsLeft));
            return true;
        } else {
            System.out.println("Sold out! Booking rejected for " + customer);
            return false;
        }
    }
}
