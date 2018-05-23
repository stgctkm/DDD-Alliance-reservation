package reservation.application;

import reservation.model.reservation.*;

public class ReservationService {

    Reservations reservations;

    public void reserve(ReservationRequest request) {
        // requestの妥当性検証
        Reservation reservation = Reservation.of(request);
        reservations.add(reservation);
    }

    public void cancel(CancellationRequest request) {
        Reservation reservation = request.of();
        // requestの妥当性検証
        reservations.cancel(reservation);
    }

}
