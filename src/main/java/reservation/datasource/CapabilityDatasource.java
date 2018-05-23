package reservation.datasource;

import reservation.model.capability.Capability;
import reservation.model.capability.CapabilityRepository;

public class CapabilityDatasource implements CapabilityRepository {
    @Override
    public Capability capability() {
        return new Capability();
    }
}
