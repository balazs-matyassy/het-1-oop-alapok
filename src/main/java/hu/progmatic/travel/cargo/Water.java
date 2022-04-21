package hu.progmatic.travel.cargo;

public class Water {
    private double volume;
    private double unitPrice;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return volume * unitPrice;
    }
}
