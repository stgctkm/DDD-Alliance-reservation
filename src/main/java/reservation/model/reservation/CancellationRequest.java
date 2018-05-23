package reservation.model.reservation;

public class CancellationRequest {
    Reservation reservation ;

    CancellationRequest(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation of() {
        return reservation;
    }
}
