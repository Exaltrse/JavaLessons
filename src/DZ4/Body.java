package DZ4;

import java.util.Objects;

//Корпус
public class Body {

    private static String manufacturer;

    private String name;
    private String mark;
    private String material;
    private int unitPrice;

    static{
        manufacturer = Constants.NO_NAME;
    }

    public Body() {
    }

    public Body(String name, String mark, String material, int unitPrice) {
        this.name = name;
        this.mark = mark;
        this.material = material;
        this.unitPrice = unitPrice;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Body.manufacturer = manufacturer;
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
        return this.name+" "+this.mark;
    }

    public static Body RandomBody()
    {
        Body body = new Body();
        body.setName(Constants.RandomString(10));
        body.setMark(Constants.RandomString(5));
        body.setMaterial(Constants.RandomString(16));
        body.setUnitPrice((Constants.RandomInt(789)+1)*100);
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return unitPrice == body.unitPrice &&
                name.equals(body.name) &&
                mark.equals(body.mark) &&
                material.equals(body.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, material, unitPrice);
    }

    @Override
    public String toString() {
        return "Body: " + manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Material " + material + "\t" +
                "Price " + unitPrice;
    }
}
