package DZ4;

import java.util.Objects;

public class Components {
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

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engeen getEngeen() {
        return engeen;
    }

    public void setEngeen(Engeen engeen) {
        this.engeen = engeen;
    }

    public AcousticSystem getAcousticSystem() {
        return acousticSystem;
    }

    public void setAcousticSystem(AcousticSystem acousticSystem) {
        this.acousticSystem = acousticSystem;
    }

    public VehicleInterior getVehicleInterior() {
        return vehicleInterior;
    }

    public void setVehicleInterior(VehicleInterior vehicleInterior) {
        this.vehicleInterior = vehicleInterior;
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
