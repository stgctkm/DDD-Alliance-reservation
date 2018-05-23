package reservation.model.capability;

public class Capability {

    int limit;
    CapabilityPolicy policy;

    public Capability() {
    }

    Capability(int initialValue) {
        this.limit = initialValue;
    }

    public Capability add(int value) {
        return new Capability(limit + value);
    }

    public Capability remove(int value) {
        return new Capability(limit - value);
    }

}
