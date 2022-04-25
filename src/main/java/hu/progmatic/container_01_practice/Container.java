package hu.progmatic.container_01_practice;

public class Container {
    public static final String UNIT = "liter";
    private static double taxRate;
    private Cargo cargo;
    private int x, y, z;

    public Container() {
    }

    public Container(Cargo cargo, int x, int y, int z) {
        this.cargo = cargo;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double getTaxRate() {
        return taxRate;
    }

    public static void setTaxRate(double taxRate) {
        Container.taxRate = taxRate;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getVolume() {
        return x * y * z;
    }

    public int getNetPrice() {
        return getVolume() * cargo.getUnitPrice();
    }

    public int getGrossPrice() {
        return (int) (getNetPrice() * (1.0 + taxRate));
    }

    @Override
    public String toString() {
        return cargo.getName() +
                "(" + x + " * " + y + " * " + z
                + " = " + getVolume() + " " + UNIT
                + " -> nettó " + getNetPrice() + " GFt /"
                + " bruttó " + getGrossPrice() + " GFt)";
    }
}
