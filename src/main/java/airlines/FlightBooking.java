package airlines;

public interface FlightBooking<S> {
    public void BookSeat(S a) throws RuntimeException;
    //public void Payment();
}
