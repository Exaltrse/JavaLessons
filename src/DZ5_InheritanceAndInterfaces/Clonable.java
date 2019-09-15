package DZ5_InheritanceAndInterfaces;

@FunctionalInterface
public interface Clonable <T extends AbstractVehicle> {
    T toClone();
}
