package hu.progmatic.travel.ships;

public class Spaceship {
    private String type;
    private int speed;
    private int w, h, l;
    private int cargo;

    public Spaceship() {

    }

    public Spaceship(String type, int w, int h, int l) {
        this(type, w, h, l, 0);
    }

    public Spaceship(String type, int w, int h, int l, int speed) {
        this.type = type;
        this.w = w;
        this.h = h;
        this.l = l;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getVolume() {
        return w * h * l;
    }

    public int getCargo() {
        return cargo;
    }

    public int getMaxCargo() {
        return (int) (getVolume() * 0.6);
    }

    public void setCargo(int cargo) {
        if (cargo >= 0 && cargo <= getMaxCargo()) {
            this.cargo = cargo;
        } else {
            System.out.println("Nincs hely a rakománynak.");
        }
    }
}
