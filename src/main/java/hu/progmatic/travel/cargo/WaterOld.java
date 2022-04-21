package hu.progmatic.travel.cargo;

public class WaterOld {
    private double volume;
    private double unitPrice;
    private double price;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
        this.price = this.volume * this.unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        this.price = this.volume * this.unitPrice;
    }

    public double getPrice() {
        return price;
    }
}
