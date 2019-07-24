package DZ3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        for(int i=0; i<=10; i++)
        {
            cars.add(new Car());
        }
        cars.add(new Car("imenovannaja mashina",true,610));
        cars.add(new Car("imenovannaja mashina2",true,2970));
        for(String s:Car.Shapka())
        {
            System.out.println(s);
        }
        for(Car c:cars)
        {
            //System.out.println(c + "\t\t"+ c.CarType());
            System.out.println(c.toString());
        }
    }
}
