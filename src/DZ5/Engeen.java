package DZ5;

import java.util.Objects;

//Двигатель
public final class Engeen extends AbstractComponent implements Nameble {
    private static String manufacturer;
    private String material;
    private int enginePower;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public Engeen() {
        this.material = Supply.NO_NAME;
        this.enginePower = Supply.BASE_NUMBER_VALUE;
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
        this.name =Supply.RandomString(10);
        this.mark=Supply.RandomString(5);
        this.material=Supply.RandomString(8);
        this.enginePower=(Supply.RandomInt(60) + 2) * 10;
        this.unitPrice=(Supply.RandomInt(315) + 1) * 60;
    }

    @Override
    public Engeen toClone() {
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
