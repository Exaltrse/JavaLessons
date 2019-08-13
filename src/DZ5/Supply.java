package DZ5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Supply {
    final static String NO_NAME = "NoName";
    final static int BASE_PRICE_VALUE = 0;
    final static int BASE_NUMBER_VALUE = 0;
    final static String EMPTY_STRING = " ";
    final static boolean BASE_BOOLEAN = false;

    private static Random r = new Random();

    static String randomString(int dlinna) {
        String resultString = "";
        for (int i = 0; i <= dlinna; i++) {
            resultString += (char) (r.nextInt(26) + 'a');
        }
        return resultString;
    }

    static int randomInt(int predel) {
        return r.nextInt(predel);
    }

    static Component randomComponent() {
        Component component = new Component();
        component.name = Supply.randomString(6);
        component.mark = Supply.randomString(9);
        component.unitPrice = (Supply.randomInt(150) + 1) * 200;
        return component;
    }

    static Body randomBody() {
        return new Body(randomComponent(), Supply.randomString(8), r.nextBoolean(), Supply.randomInt(1678));
    }

    static Door randomDoor() {
        return new Door(randomComponent(), Supply.randomString(8), r.nextBoolean(), Supply.randomInt(1678));
    }

    static Engeen randomEngeen() {
        return new Engeen(randomComponent(), Supply.randomString(8), r.nextBoolean(), Supply.randomInt(1678));
    }

    static Interior randomInterior() {
        return new Interior(randomComponent(), Supply.randomString(8), r.nextBoolean(), Supply.randomInt(1678));
    }

    static Wheel randomWheel() {
        return new Wheel(randomComponent(), Supply.randomString(8), r.nextBoolean(), Supply.randomInt(1678));
    }

    static Vehicle randomVehicle()
    {
        Vehicle vehicle = new Vehicle();
        vehicle.name = Supply.randomString(4);
        vehicle.mark = Supply.randomString(6);
        vehicle.listOfComponents = new ArrayList<>();
        for(int i = 0; i<=(r.nextInt(20)+1); i++)
        {
            switch (r.nextInt(5)+1){
                case 1:{
                    vehicle.listOfComponents.add(randomBody());
                    break;
                }
                case 2:{
                    vehicle.listOfComponents.add(randomDoor());
                    break;
                }
                case 3:{
                    vehicle.listOfComponents.add(randomEngeen());
                    break;
                }
                case 4:{
                    vehicle.listOfComponents.add(randomInterior());
                    break;
                }
                default:{
                    vehicle.listOfComponents.add(randomWheel());
                    break;
                }
            }
        }
        return vehicle;
    }

    static void printVehicleList(List<Vehicle> carList) {
        int counter = 1;
        for (Vehicle car : carList) {
            System.out.println(counter++ + ".\t" + Vehicle.getManufacturer() + "\t" + car.getFullName() + "\tCost: " + car.getCost());
        }

    }

    static void printDetaildVehicle(Vehicle vehicle, int index){
        String out = "----------" + "\n" +
                index + "\t" +
                "Manufacturer: " + Vehicle.getManufacturer() + "\t" +
                vehicle.getName() + "\t" +
                "Cost: " + vehicle.getCost() + "\n" +
                "List of components: \n";
        int counter = 1;
        for(AbstractComponent c : vehicle.listOfComponents){
//            out += "\t" + counter + "\t" +
//                    c.getFullName() + "\t" +
//                    c.getCost() + "\n";
            out += "\n\t" + counter + "\t" + c.toString();
            counter++;
        }
        System.out.println(out);
    }
}
