package DZ4;

import java.util.Objects;

//Акустическая система
public class AcousticSystem {
    private static String manufacturer;

    private String name;
    private String mark;
    private int numberOfSpeakers;
    private int controlCenterUnutPrice;
    private int speakersUnitPrice;

    static {
        manufacturer = Supply.NO_NAME;
    }

    public AcousticSystem() {
        this.name = Supply.NO_NAME;
        this.mark = Supply.NO_NAME;
        this.numberOfSpeakers = Supply.BASE_NUMBER_VALUE;
        this.controlCenterUnutPrice = Supply.BASE_PRICE_VALUE;
        this.speakersUnitPrice = Supply.BASE_PRICE_VALUE;
    }

    public AcousticSystem(String name, String mark, int numberOfSpeakers, int controlCenterUnutPrice, int speakersUnitPrice) {
        this.name = name;
        this.mark = mark;
        this.numberOfSpeakers = numberOfSpeakers;
        this.controlCenterUnutPrice = controlCenterUnutPrice;
        this.speakersUnitPrice = speakersUnitPrice;
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
        return speakersUnitPrice;
    }

    public void setSpeakersUnitPrice(int speakersUnitPrice) {
        this.speakersUnitPrice = speakersUnitPrice;
    }

    public int getCost() {
        return this.numberOfSpeakers * this.speakersUnitPrice + this.controlCenterUnutPrice;
    }

    public String getFullName() {
        return this.name + " " + this.mark;
    }

    protected AcousticSystem toClone() {
        return new AcousticSystem(this.name, this.mark, this.numberOfSpeakers, this.controlCenterUnutPrice, this.speakersUnitPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcousticSystem that = (AcousticSystem) o;
        return numberOfSpeakers == that.numberOfSpeakers &&
                controlCenterUnutPrice == that.controlCenterUnutPrice &&
                speakersUnitPrice == that.speakersUnitPrice &&
                name.equals(that.name) &&
                mark.equals(that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, numberOfSpeakers, controlCenterUnutPrice, speakersUnitPrice);
    }

    @Override
    public String toString() {
        return "AcousticSystem: " +
                manufacturer + "\t" +
                this.getFullName() + "\t" +
                "Number of speakers: " + numberOfSpeakers + "\t" +
                "Control center price: " + controlCenterUnutPrice + "\t" +
                "Speakers price " + speakersUnitPrice + "\t" +
                "Full cost: " + this.getCost();
    }
}
