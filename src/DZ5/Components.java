package DZ5;

import java.util.Objects;

public class Components extends Vehicle implements Randomizable {
    private Wheels wheels;
    private Body body;
    private Engeen engeen;
    private AcousticSystem acousticSystem;
    private VehicleInterior vehicleInterior;

    public Components() {
        this.wheels = new Wheels();
        this.body = new Body();
        this.engeen = new Engeen();
        this.acousticSystem = new AcousticSystem();
        this.vehicleInterior = new VehicleInterior();
    }

    public Components(Wheels wheels, Body body, Engeen engeen, AcousticSystem acousticSystem, VehicleInterior vehicleInterior) {
        this.wheels = wheels;
        this.body = body;
        this.engeen = engeen;
        this.acousticSystem = acousticSystem;
        this.vehicleInterior = vehicleInterior;
    }

    public final Wheels getWheels() {
        return wheels;
    }

    public final void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public final Body getBody() {
        return body;
    }

    public final void setBody(Body body) {
        this.body = body;
    }

    public final Engeen getEngeen() {
        return engeen;
    }

    public final void setEngeen(Engeen engeen) {
        this.engeen = engeen;
    }

    public final AcousticSystem getAcousticSystem() {
        return acousticSystem;
    }

    public final void setAcousticSystem(AcousticSystem acousticSystem) {
        this.acousticSystem = acousticSystem;
    }

    public final VehicleInterior getVehicleInterior() {
        return vehicleInterior;
    }

    public final void setVehicleInterior(VehicleInterior vehicleInterior) {
        this.vehicleInterior = vehicleInterior;
    }

    @Override
    public void randomize() {
        Components components = new Components();
        this.wheels.randomize();
        this.body.randomize();
        this.engeen.randomize();
        this.acousticSystem.randomize();
        this.vehicleInterior.randomize();
    }

    @Override
    public int getCost() {
        return wheels.getCost() + body.getCost() + engeen.getCost() + acousticSystem.getCost() + vehicleInterior.getCost();
    }

    @Override
    public Object toClone() {
        return new Components(wheels.toClone(), body.toClone(), engeen.toClone(), acousticSystem.toClone(), vehicleInterior.toClone());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Components that = (Components) o;
        return wheels.equals(that.wheels) &&
                body.equals(that.body) &&
                engeen.equals(that.engeen) &&
                acousticSystem.equals(that.acousticSystem) &&
                vehicleInterior.equals(that.vehicleInterior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, body, engeen, acousticSystem, vehicleInterior);
    }

    @Override
    public String toString() {
        return "Components " +
                "wheels=" + wheels +
                ", body=" + body +
                ", engeen=" + engeen +
                ", acousticSystem=" + acousticSystem +
                ", vehicleInterior=" + vehicleInterior +
                '}';
    }
}
