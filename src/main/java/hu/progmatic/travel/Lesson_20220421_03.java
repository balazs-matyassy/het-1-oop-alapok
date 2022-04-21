package hu.progmatic.travel;

import hu.progmatic.travel.ships.Pirate;
import hu.progmatic.travel.ships.Spaceship;

public class Lesson_20220421_03 {
    public static void main(String[] args) {
        Spaceship spaceship = new Spaceship("BlackPearl", 10, 10, 25, 100);
        Spaceship target = new Spaceship("Gold", 100, 100, 3000);
        target.setCargo(100000);
        Pirate pirate = new Pirate("Jack", spaceship);

        System.out.println(spaceship.getCargo());
        pirate.pirate(target);
        System.out.println(spaceship.getCargo());
    }
}
