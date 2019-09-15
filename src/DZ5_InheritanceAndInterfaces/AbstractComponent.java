package DZ5_InheritanceAndInterfaces;

public abstract class AbstractComponent extends AbstractVehicle {
    public int unitPrice = Supply.BASE_PRICE_VALUE;

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
