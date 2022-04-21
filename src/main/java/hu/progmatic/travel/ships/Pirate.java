package hu.progmatic.travel.ships;

public class Pirate {
    private String name;
    private Spaceship spaceship;

    public Pirate() {

    }

    public Pirate(String name, Spaceship spaceship) {
        this.name = name;
        this.spaceship = spaceship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }
}
