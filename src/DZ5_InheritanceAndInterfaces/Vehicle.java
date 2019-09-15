package DZ5_InheritanceAndInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehicle extends AbstractVehicle{

    private static String manufacturer = Supply.NO_NAME;

    List<AbstractComponent> listOfComponents;

    public Vehicle() {
        listOfComponents = new ArrayList<>();
    }

    public Vehicle(String name, String mark, List<AbstractComponent> listOfComponents) {
        this.name = name;
        this.mark = mark;
        this.listOfComponents = listOfComponents;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Vehicle.manufacturer = manufacturer;
    }

    public List<AbstractComponent> getListOfComponents() {
        return listOfComponents;
    }

    public void setListOfComponents(List<AbstractComponent> listOfComponents) {
        this.listOfComponents = listOfComponents;
    }

    @Override
    public Vehicle toClone() {
        Vehicle vehicle = new Vehicle();
        vehicle.name = this.name;
        vehicle.mark = this.mark;
        for(Clonable c : listOfComponents){
            vehicle.listOfComponents.add((AbstractComponent)c.toClone());
        }
        return vehicle;
    }

    @Override
    public int getCost() {
        int cost = 0;
        for(Costable c : listOfComponents){
            cost+=c.getCost();
        }
        return cost;
    }

    @Override
    public String getFullName() {
        return name + " " + mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.name.equals(vehicle.name) &&
                this.mark.equals(vehicle.mark) &&
                Objects.equals(getListOfComponents(), vehicle.getListOfComponents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, getListOfComponents());
    }
}
