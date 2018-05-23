package reservation.model.avability;

import reservation.model.capability.Capability;
import reservation.model.reservation.Reservations;

public class Availability {
    Capability capability;
    Reservations reservations;

    AvailabilityPolicy policy;

    Availability(Capability capability, Reservations reservations) {
        this.capability = capability;
        this.reservations = reservations;
    }

    public String show() {
        return "利用可能状況";
    }

    public static Availability of(Capability capability, Reservations reservations) {
        return new Availability(capability, reservations);
    }
}
