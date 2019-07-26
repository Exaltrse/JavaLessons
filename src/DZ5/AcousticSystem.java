package DZ5;

import java.util.Objects;

//Акустическая система
public class AcousticSystem extends AbstractComponent implements Nameble{
    private static String manufacturer;

    private int numberOfSpeakers;
    private int controlCenterUnutPrice;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public AcousticSystem() {
        this.numberOfSpeakers = Supply.BASE_NUMBER_VALUE;
        this.controlCenterUnutPrice = Supply.BASE_PRICE_VALUE;
    }

    public AcousticSystem(String name, String mark, int numberOfSpeakers, int controlCenterUnutPrice, int speakersUnitPrice) {
        this.name = name;
        this.mark = mark;
        this.numberOfSpeakers = numberOfSpeakers;
        this.controlCenterUnutPrice = controlCenterUnutPrice;
        this.unitPrice = speakersUnitPrice;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        AcousticSystem.manufacturer = manufacturer;
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

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getControlCenterUnutPrice() {
        return controlCenterUnutPrice;
    }

    public void setControlCenterUnutPrice(int controlCenterUnutPrice) {
        this.controlCenterUnutPrice = controlCenterUnutPrice;
    }

    public int getSpeakersUnitPrice() {
        return unitPrice;
    }

    public void setSpeakersUnitPrice(int speakersUnitPrice) {
        this.unitPrice = speakersUnitPrice;
    }

    @Override
    public int getCost() {
        return this.numberOfSpeakers * this.unitPrice + this.controlCenterUnutPrice;
    }

    @Override
    public String getFullName() {
        return this.name + " " + this.mark;
    }

    @Override
    public void randomize() {
        this.name = (Supply.RandomString(10));
        this.mark = (Supply.RandomString(5));
        this.numberOfSpeakers = (Supply.RandomInt(12));
        this.controlCenterUnutPrice = ((Supply.RandomInt(50) + 1) * 10);
        this.unitPrice = (Supply.RandomInt(30) + 1);
    }

    @Override
    public AcousticSystem toClone() {
        return new AcousticSystem(this.name, this.mark, this.numberOfSpeakers, this.controlCenterUnutPrice, this.unitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcousticSystem that = (AcousticSystem) o;
        return numberOfSpeakers == that.numberOfSpeakers &&
                controlCenterUnutPrice == that.controlCenterUnutPrice &&
                unitPrice == that.unitPrice &&
                name.equals(that.name) &&
                mark.equals(that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, numberOfSpeakers, controlCenterUnutPrice, unitPrice);
    }

    @Override
    public String toString() {
        return "AcousticSystem: " +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Number of speakers: " + numberOfSpeakers + "\t" +
                "Control center price: " + controlCenterUnutPrice + "\t" +
                "Speakers price " + unitPrice + "\t" +
                "Full cost: " + this.getCost();
    }
}
