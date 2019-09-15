package DZ5_InheritanceAndInterfaces;

public abstract class AbstractVehicle implements Clonable, Nameble, Costable {
    public String name = Supply.NO_NAME;
    public String mark = Supply.NO_NAME;

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

    public String getFullName() {
        return name + " " + mark;
    }
}
