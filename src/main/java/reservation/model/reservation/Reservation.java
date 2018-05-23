package reservation.model.reservation;

public class Reservation {
    ReservationRequest request ;
    CancellationPolicy cancellationPolicy;

    Reservation(ReservationRequest request) {
        this.request = request;
    }

    public static Reservation of(ReservationRequest request) {
        return new Reservation(request);
    }
}
