package reservation.application;

import reservation.model.capability.Capability;
import reservation.model.capability.CapabilityRepository;

public class CapabilityService {
    CapabilityRepository repository;

    void addCapability(int value) {
        Capability capability = repository.capability();
        capability = capability.add(value);
    }

    void removeCapability(int value) {
        Capability capability = repository.capability();
        capability = capability.remove(value);
    }
}
