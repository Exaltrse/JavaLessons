package DZ3_Class;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            cars.add(new Car());
        }
        cars.add(new Car("imenovannaja mashina", true, 610));
        cars.add(new Car("imenovannaja mashina2", true, 2970));
        for (String s : Support.stingForSshapka()) {
            System.out.println(s);
        }
        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }
}
