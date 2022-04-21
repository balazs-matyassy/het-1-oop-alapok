package hu.progmatic.travel.ships;

public class Spaceship2 {
    private String type;
    private int speed;
    private int w, h, l;
    private int volume;

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
        this.volume = this.w * this.h * this.l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
        this.volume = this.w * this.h * this.l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
        this.volume = this.w * this.h * this.l;
    }

    public int getVolume() {
        return volume;
    }
}
