package DZ5;

import java.util.Objects;

//Колеса
public class Engeen extends AbstractComponent{
    private static String manufacturer;

    //Fields for the proposed filling. Do not participate in the task directly.
    private String stringField;
    private boolean booField;
    private int intField;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public Engeen() {
        this.stringField = Supply.EMPTY_STRING;
        this.booField = Supply.BASE_BOOLEAN;
        this.intField = Supply.BASE_NUMBER_VALUE;
    }

    public Engeen(Component component, String stringField, boolean booField, int intField) {
        this.name = component.name;
        this.name = component.name;
        this.unitPrice = component.unitPrice;
        this.stringField = stringField;
        this.booField = booField;
        this.intField = intField;
    }


    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Engeen.manufacturer = manufacturer;
    }



    @Override
    public int getCost() {
        //Here can be a logic for calculating the cost.
        return this.unitPrice;
    }


    @Override
    public Engeen toClone() {
        return new Engeen(new Component(this.name, this.mark, this.unitPrice), this.stringField, this.booField,this.intField);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engeen wheel = (Engeen) o;
        return name.equals(wheel.name) &&
                mark.equals(wheel.mark) &&
                unitPrice == wheel.unitPrice &&
                stringField.equals(wheel.stringField) &&
                booField == wheel.booField &&
                intField == wheel.intField;
    }

    @Override
    public String toString() {
        return "Wheels: \t" +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "String: " + stringField + "\t" +
                "Boolean: " + booField + "\t" +
                "Price: " + unitPrice + "\t" +
                "Full cost: " + this.getCost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.mark, this.unitPrice, stringField, booField, intField);
    }
}
