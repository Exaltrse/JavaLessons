package DZ4_ClassInteraction;

import java.util.Objects;

//Колеса
public class Wheels {
    private static String manufacturer;
    private String name;
    private String mark;
    private int number;
    private int unitPrice;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public Wheels() {
        this.name = Supply.NO_NAME;
        this.mark = Supply.NO_NAME;
        this.number = Supply.BASE_NUMBER_VALUE;
        this.unitPrice = Supply.BASE_PRICE_VALUE;
    }

    public Wheels(String name, String mark, int number, int unitPrice) {
        this.name = name;
        this.mark = mark;
        this.number = number;
        this.unitPrice = unitPrice;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Wheels.manufacturer = manufacturer;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCost() {
        return this.number * this.unitPrice;
    }

    public String getFullName() {
        return this.name + " " + this.mark;
    }

    protected Wheels toClone() {
        return new Wheels(this.name, this.mark, this.number, this.unitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheels wheels = (Wheels) o;
        return number == wheels.number &&
                unitPrice == wheels.unitPrice &&
                name.equals(wheels.name) &&
                mark.equals(wheels.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, number, unitPrice);
    }

    @Override
    public String toString() {
        return "Wheels: \t" +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Number: " + number + "\t" +
                "Price: " + unitPrice + "\t" +
                "Full cost: " + this.getCost();
    }
}
