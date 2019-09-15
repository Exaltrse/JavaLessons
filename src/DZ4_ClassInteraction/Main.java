package DZ4_ClassInteraction;

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
            carList.add(Supply.randomCar());
        }
        System.out.println("Do izmenenij.");
        Supply.printCar(carList);
        Car.setManufacturer("IzmenennajaFirma");
        for (Car car : carList) {
            switch (r.nextInt(5)) {
                case 0: {
                    car.setEngeen(Supply.randomEngeen());
                    break;
                }
                case 1: {
                    car.setBody(Supply.randomBody());
                    break;
                }
                case 2: {
                    car.setAcousticSystem(Supply.randomAcousticSystem());
                    break;
                }
                case 3: {
                    car.setVehicleInterior(Supply.randomVehicleInterior());
                    break;
                }
                case 4: {
                    car.setWheels(Supply.randomWheels());
                    break;
                }

            }

        }
        System.out.println("Posle izmenenij.");
        Supply.printCar(carList);

    }
}
