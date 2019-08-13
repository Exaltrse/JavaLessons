package DZ5;

@FunctionalInterface
public interface Clonable <T extends AbstractVehicle> {
    T toClone();
}
