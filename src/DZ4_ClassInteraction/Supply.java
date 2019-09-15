package DZ4_ClassInteraction;

import java.util.ArrayList;
import java.util.Random;

final class Supply {
    final static String NO_NAME = "NoName";
    final static int BASE_PRICE_VALUE = 0;
    final static int BASE_NUMBER_VALUE = 0;

    static String randomString(int dlinna) {
        String resultString = "";
        Random r = new Random();
        for (int i = 0; i <= dlinna; i++) {
            resultString += (char) (r.nextInt(26) + 'a');
        }
        return resultString;
    }

    static int randomInt(int predel) {
        Random r = new Random();
        return r.nextInt(predel);
    }

    public static Components randomComponents() {
        Components components = new Components();
        components.setWheels(Supply.randomWheels());
        components.setBody(Supply.randomBody());
        components.setEngeen(Supply.randomEngeen());
        components.setAcousticSystem(Supply.randomAcousticSystem());
        components.setVehicleInterior(Supply.randomVehicleInterior());
        return components;
    }

    static AcousticSystem randomAcousticSystem() {
        AcousticSystem acousticSystem = new AcousticSystem();
        acousticSystem.setName(Supply.randomString(10));
        acousticSystem.setMark(Supply.randomString(5));
        acousticSystem.setNumberOfSpeakers(Supply.randomInt(12));
        acousticSystem.setControlCenterUnutPrice((Supply.randomInt(50) + 1) * 10);
        acousticSystem.setSpeakersUnitPrice(Supply.randomInt(30) + 1);
        return acousticSystem;
    }

    static Body randomBody() {
        Body body = new Body();
        body.setName(Supply.randomString(10));
        body.setMark(Supply.randomString(5));
        body.setMaterial(Supply.randomString(16));
        body.setUnitPrice((Supply.randomInt(789) + 1) * 100);
        return body;
    }

    static Car randomCar() {
        Car car = new Car();
        car.setComponents(Supply.randomComponents());
        car.setName(Supply.randomString(10));
        car.setMark(Supply.randomString(5));
        return car;
    }

    static Engeen randomEngeen() {
        Engeen engeen = new Engeen();
        engeen.setName(Supply.randomString(10));
        engeen.setMark(Supply.randomString(5));
        engeen.setMaterial(Supply.randomString(8));
        engeen.setEnginePower((Supply.randomInt(60) + 2) * 10);
        engeen.setUnitPrice((Supply.randomInt(315) + 1) * 60);
        return engeen;
    }

    static VehicleInterior randomVehicleInterior() {
        VehicleInterior vehicleInterior = new VehicleInterior();
        vehicleInterior.setName(Supply.randomString(15));
        vehicleInterior.setMark(Supply.randomString(6));
        vehicleInterior.setColor(Supply.randomString(7));
        vehicleInterior.setUnitPrice((Supply.randomInt(400) + 1) * 10);
        return vehicleInterior;
    }

    static Wheels randomWheels() {
        Wheels wheels = new Wheels();
        wheels.setName(Supply.randomString(12));
        wheels.setMark(Supply.randomString(6));
        wheels.setNumber(Supply.randomInt(4) + 1);
        wheels.setUnitPrice((Supply.randomInt(50) + 1) * 10);
        return wheels;
    }

    static void printCar(ArrayList<Car> carList) {
        int counter = 1;
        for (Car car : carList) {
            System.out.println(counter++ + ".\t" + Car.getManufacturer() + "\t" + car.getFullName() + "\tCost: " + car.getCost());
        }

    }
}
