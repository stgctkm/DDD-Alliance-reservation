package reservation.datasource;

import reservation.model.reservation.Reservation;
import reservation.model.reservation.Reservations;

import java.util.HashSet;
import java.util.Set;

public class ReservationDatasource implements Reservations {
    Set<Reservation> reservations = new HashSet<>();

    public void add(Reservation reservation) {
        reservations.add(reservation);
    }

    public void cancel(Reservation reservation) {
        reservations.remove(reservation);

    }
}
