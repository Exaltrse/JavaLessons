package DZ5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random r = new Random();
        List<Vehicle> carList = new ArrayList<>();
        for (int i = 0; i < (r.nextInt(40) + 1); i++) {
            carList.add(Supply.randomVehicle());
        }
//        List<Vehicle> controlList = new ArrayList<>();
//        for(Clonable c : carList){
//            controlList.add((Vehicle)c.toClone());
//        }

        System.out.println("Before edit.");
        Supply.printVehicleList(carList);
        Vehicle.setManufacturer("Chaged Manufactury");
        for (Vehicle car : carList) {
            car.listOfComponents.get(r.nextInt(car.listOfComponents.size())).setUnitPrice((r.nextInt(250)+1)*20);
        }
        System.out.println("After edit.");
        Supply.printVehicleList(carList);

//        System.out.println("-------------------------------");
//        System.out.println("More detail before edit\n");
//        int counter = 1;
//        for(Vehicle v : controlList){
//            Supply.printDetaildVehicle(v,counter);
//            counter++;
//        }
//        System.out.println("More detail after edit\n");
//        counter = 1;
//        for(Vehicle v : carList){
//            Supply.printDetaildVehicle(v,counter);
//            counter++;
//        }

    }
}
