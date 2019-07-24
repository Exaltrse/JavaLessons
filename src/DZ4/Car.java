package DZ4;

import java.util.Objects;

public class Car {

    private static String manufacturer;

    private String name;
    private String mark;
    private Wheels wheels;
    private Body body;
    private Engeen engeen;
    private AcousticSystem acousticSystem;
    private VehicleInterior vehicleInterior;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public Car() {
    }

    public Car(String name, String mark, Components components) {
        this.name = name;
        this.mark = mark;
        this.wheels = components.getWheels();
        this.body = components.getBody();
        this.engeen = components.getEngeen();
        this.acousticSystem = components.getAcousticSystem();
        this.vehicleInterior = components.getVehicleInterior();
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Car.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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

    public Components getComponents() {
        return new Components(this.wheels, this.body, this.engeen, this.acousticSystem, this.vehicleInterior);
    }

    public void setComponents(Components components) {
        this.wheels = components.getWheels();
        this.body = components.getBody();
        this.engeen = components.getEngeen();
        this.acousticSystem = components.getAcousticSystem();
        this.vehicleInterior = components.getVehicleInterior();
    }

    public String getFullName() {
        return this.name + " " + this.mark;
    }

    public int getCost() {
        return this.wheels.getCost() + this.body.getCost() + this.engeen.getCost() + this.acousticSystem.getCost() + this.vehicleInterior.getCost();
    }

    public static Car RandomCar() {
        Car car = new Car();
        car.setComponents(Components.RandomComponents());
        car.setName(Supply.RandomString(10));
        car.setMark(Supply.RandomString(5));
        return car;
    }

    protected Car toClone() {
        return new Car(
                this.name,
                this.mark,
                new Components(
                        this.wheels.toClone(),
                        this.body.toClone(),
                        this.engeen.toClone(),
                        this.acousticSystem.toClone(),
                        this.vehicleInterior.toClone()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) &&
                mark.equals(car.mark) &&
                wheels.equals(car.wheels) &&
                body.equals(car.body) &&
                engeen.equals(car.engeen) &&
                acousticSystem.equals(car.acousticSystem) &&
                vehicleInterior.equals(car.vehicleInterior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, wheels, body, engeen, acousticSystem, vehicleInterior);
    }

    @Override
    public String toString() {
        return "Car " +
                manufacturer + " " +
                this.getFullName() + "\n" +
                wheels + "\n" +
                body + "\n" +
                engeen + "\n" +
                acousticSystem + "\n" +
                vehicleInterior + "\n" +
                "Cost: " + this.getCost();
    }
}