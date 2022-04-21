package hu.progmatic.travel;

import hu.progmatic.travel.cargo.Water;

public class Lesson_20220421_01 {
    public static void main(String[] args) {
        Water water = new Water();
        water.setVolume(200.0);
        water.setUnitPrice(10.0);

        System.out.println(water.getPrice());
    }
}
