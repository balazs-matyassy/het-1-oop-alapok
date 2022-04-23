package hu.progmatic.tourism;

public class Travel {
    private Planet source;
    private Planet destination;
    private double time;
    private int price;

    public Travel() {
    }

    public Travel(Planet source, Planet destination, double time, int price) {
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.price = price;
    }

    public Planet getSource() {
        return source;
    }

    public void setSource(Planet source) {
        this.source = source;
    }

    public Planet getDestination() {
        return destination;
    }

    public void setDestination(Planet destination) {
        this.destination = destination;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDistance() {
        double dx = source.getX() - destination.getX();
        double dy = source.getY() - destination.getY();
        double dz = source.getZ() - destination.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public String getInfoSheet() {
        return source.getName() + " -> " + destination.getName() + "\n"
                + "idő:\t\t" + time + " óra\n"
                + "ár:\t\t" + price + " GFt\n"
                + "távolság:\t" + getDistance() + " km";
    }
}
