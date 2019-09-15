package DZ3_Class;

import java.util.Objects;

public class Car {

    private static int counter = 0;

    //1. Создать класс Car с
    // 3 полями различных типов,
    //
    // 2 конструкторами, один из которых с параметрами.
    // В классе создать 2 метода, статический и не статический.
    // Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
    // Второй метод генерирует рандомную машину.

    public String name;
    private boolean svobodna;
    double ves;

    public Car() {
        Car tmp = Support.randomCar();
        this.name = tmp.name;
        this.svobodna = tmp.svobodna;
        this.ves = tmp.ves;
        counter++;
    }

    public Car(String name, boolean svobodna, double ves) {
        this.name = name;
        this.svobodna = svobodna;
        this.ves = ves;
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSvobodna() {
        return this.svobodna;
    }

    public void setSvobodna(boolean svobodna) {
        this.svobodna = svobodna;
    }

    public double getVes() {
        return this.ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    //----------

    public String carType() {
        String[] results = {"легковой", "джип", "грузовой"};
        int switcher = 0;
        if ((ves >= 0) && (ves < 500)) switcher = 0;
        else if ((ves >= 500) && (ves < 1000)) switcher = 1;
        else switcher = 2;
        switch (switcher) {
            case 0: {
                return results[0];
            }
            case 1: {
                return results[1];
            }
            case 2: {
                return results[2];
            }
            default: {
                return "тип не определен";
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (this.svobodna) s += "svobodna";
        else s += "zanjata";
        StringBuilder str = new StringBuilder(60);
        str.setLength(60);
        for (int i = 0; i < 60; i++) {
            str.insert(i, ' ');
        }
        str.insert(0, name);
        str.insert(24, s);
        str.insert(38, ves);
        str.insert(47, this.carType());
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return svobodna == car.svobodna &&
                Double.compare(car.ves, ves) == 0 &&
                name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, svobodna, ves);
    }
}
