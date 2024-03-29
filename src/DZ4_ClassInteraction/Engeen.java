package DZ4_ClassInteraction;

import java.util.Objects;

//Двигатель
public class Engeen {
    private static String manufacturer;
    private String name;
    private String mark;
    private String material;
    private int enginePower;
    private int unitPrice;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public Engeen() {
        this.name = Supply.NO_NAME;
        this.mark = Supply.NO_NAME;
        this.material = Supply.NO_NAME;
        this.enginePower = Supply.BASE_NUMBER_VALUE;
        this.unitPrice = Supply.BASE_PRICE_VALUE;
    }

    public Engeen(String name, String mark, String material, int enginePower, int unitPrice) {
        this.name = name;
        this.mark = mark;
        this.material = material;
        this.enginePower = enginePower;
        this.unitPrice = unitPrice;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Engeen.manufacturer = manufacturer;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCost() {
        return this.unitPrice;
    }

    public String getFullName() {
        return this.name + " " + this.mark;
    }

    protected Engeen toClone() {
        return new Engeen(this.name, this.mark, this.material, this.enginePower, this.unitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engeen engeen = (Engeen) o;
        return enginePower == engeen.enginePower &&
                unitPrice == engeen.unitPrice &&
                name.equals(engeen.name) &&
                mark.equals(engeen.mark) &&
                material.equals(engeen.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, material, enginePower, unitPrice);
    }

    @Override
    public String toString() {
        return "Engeen: " +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Material: " + material + "\t" +
                "Power: " + enginePower + "\t" +
                "Price: " + unitPrice;
    }
}
