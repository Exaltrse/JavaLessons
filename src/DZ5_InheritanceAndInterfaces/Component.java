package DZ5_InheritanceAndInterfaces;
//It's used as a shell for more convenient writing of constructors.
public class Component extends AbstractComponent {

    public Component() {
    }

    public Component(String name, String mark, int unitPrice) {
        this.name = name;
        this.mark = mark;
        this.unitPrice = unitPrice;
    }

    @Override
    public Component toClone() {
        return new Component(this.name, this.mark, this.unitPrice);
    }

    @Override
    public int getCost() {
        return unitPrice;
    }
}
