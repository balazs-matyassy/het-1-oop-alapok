package hu.progmatic.container_01_practice;

public class Cargo {
    private final String id;
    private String name;
    private int unitPrice;

    public Cargo(String id) {
        this.id = id;
    }

    public Cargo(String id, String name, int unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unitPrice + " GFt / liter";
    }
}
