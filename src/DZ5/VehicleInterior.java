package DZ5;

import java.util.Objects;

//Салон автомобиля
public class VehicleInterior extends AbstractComponent implements Nameble{
    private static String manufacturer;
    private String color;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public VehicleInterior() {
        this.color = Supply.NO_NAME;
    }

    public VehicleInterior(String name, String mark, String color, int unitPrice) {
        this.name = name;
        this.mark = mark;
        this.color = color;
        this.unitPrice = unitPrice;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        VehicleInterior.manufacturer = manufacturer;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int getCost() {
        return this.unitPrice;
    }

    @Override
    public String getFullName() {
        return this.name + " " + this.mark;
    }

    @Override
    public void randomize() {
        this.name = (Supply.RandomString(15));
        this.mark = (Supply.RandomString(6));
        this.color = (Supply.RandomString(7));
        this.unitPrice = ((Supply.RandomInt(400) + 1) * 10);
    }

    @Override
    public VehicleInterior toClone() {
        return new VehicleInterior(this.name, this.mark, this.color, this.unitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleInterior that = (VehicleInterior) o;
        return unitPrice == that.unitPrice &&
                name.equals(that.name) &&
                mark.equals(that.mark) &&
                color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, color, unitPrice);
    }

    @Override
    public String toString() {
        return "VehicleInterior: " +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Color: " + color + "\t" +
                "Price:" + unitPrice;
    }
}
