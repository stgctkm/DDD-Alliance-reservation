package reservation.application;

import reservation.model.avability.Availability;
import reservation.model.capability.Capability;
import reservation.model.capability.CapabilityRepository;
import reservation.model.reservation.Reservations;

public class AvailabilityService {
    CapabilityRepository capabilityRepository;
    Reservations reservations;

    Availability availability() {
        Capability capability = capabilityRepository.capability();
        return Availability.of(capability, reservations);
    }
}
