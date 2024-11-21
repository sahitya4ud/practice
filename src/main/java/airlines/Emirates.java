package airlines;

public class Emirates<S> implements FlightBooking<S>{

    @Override
    public void BookSeat(S a) {
        System.out.println("Booking successfull");
    }

//    @Override
//    public void Payment() {
//        System.out.println("Payment successfull");
//
//    }
}
