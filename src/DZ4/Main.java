package DZ4;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    ////Класс машина
    //        //5 деталей
    //        //цена для каждой детали
    //        //название фирмы производителя через статическую переменную
    //        //название + марка
    //        //1. Вывести стоимость автобиля
    //        //2. Вывести название фирмы + название модели
    //        //3. Провести замену деталей(изменить цену)
    //        //4. Пересчитать сумму автомобиля
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < (r.nextInt(40) + 1); i++) {
            carList.add(Car.RandomCar());
        }
//        //Создаем копию для последующего контроля работы.
//        ArrayList<Car> bufferCarList = new ArrayList<Car>();
//        for(Car c:carList){
//            bufferCarList.add(c.toClone());
//        }
        System.out.println("Do izmenenij.");
        printCar(carList);
        Car.setManufacturer("IzmenennajaFirma");
        for (Car car : carList) {
            switch (r.nextInt(5)) {
                case 0: {
                    car.setEngeen(Engeen.RandomEngeen());
                    break;
                }
                case 1: {
                    car.setBody(Body.RandomBody());
                    break;
                }
                case 2: {
                    car.setAcousticSystem(AcousticSystem.RandomAcousticSystem());
                    break;
                }
                case 3: {
                    car.setVehicleInterior(VehicleInterior.RandomVehicleInterior());
                    break;
                }
                case 4: {
                    car.setWheels(Wheels.RandomWheels());
                    break;
                }

            }

        }
        System.out.println("Posle izmenenij.");
        printCar(carList);

//        //Для более подробного изучения вносимых изменений.
//        System.out.println("\n\n");
//        printCar(bufferCarList);
//        System.out.println("\n\n\nДля наглядности более подробное содержимое списков до и после изменений:\n");
//        System.out.println("До изменений.");
//        int counter = 1;
//        for(Car c:bufferCarList){
//            System.out.println(counter++ + "  " + c);
//        }
//        System.out.println("После изменений.");
//        counter = 1;
//        for(Car c:carList){
//            System.out.println(counter++ + "  " + c);
//        }

    }

    private static void printCar(ArrayList<Car> carList) {
        int counter = 1;
        for (Car car : carList) {
            System.out.println(counter++ + ".\t" + Car.getManufacturer() + "\t" + car.getFullName() + "\tCost: " + car.getCost());
        }

    }

}
