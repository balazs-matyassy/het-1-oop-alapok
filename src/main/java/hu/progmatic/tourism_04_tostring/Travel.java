package hu.progmatic.tourism_04_tostring;

public class Travel {
    public static final int FOUNDED = 2210;
    private static String president;
    private Planet source;
    private Planet destination;
    private double time;
    private Integer price;

    public Travel() {
    }

    public Travel(Planet source, Planet destination, double time, Integer price) {
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.price = price;
    }

    public static void elect(
            String candidate1, String candidate2, String candidate3,
            int votes1, int votes2, int votes3
    ) {
        if (votes1 >= votes2 && votes1 >= votes3) {
            president = candidate1;
        } else if (votes2 >= votes3) { // votes2 >= votes1 && votes2 >= votes3
            president = candidate2;
        } else {
            president = candidate3;
        }
    }

    public static void elect(String candidate1, String candidate2, int votes1, int votes2) {
        elect(candidate1, candidate2, null, votes1, votes2, Integer.MIN_VALUE);
    }

    public static String getPresident() {
        return president;
    }

    public static void setPresident(String president) {
        Travel.president = president;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public double getDistance() {
        double dx = source.getX() - destination.getX();
        double dy = source.getY() - destination.getY();
        double dz = source.getZ() - destination.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        String priceInfo = price != null
                ? "ár:\t\t\t" + price + " GFt"
                : "JELENLEG NEM FOGLALHATÓ";

        return "==============================\n"
                + "\t Alapítva:\t" + FOUNDED + "\n"
                + "\t Elnök\t\t: " + president + "\n"
                + "==============================\n"
                + source.getName() + " -> " + destination.getName() + "\n"
                + "idő:\t\t" + time + " óra\n"
                + priceInfo + "\n"
                + "távolság:\t" + getDistance() + " km";
    }
}
