package hu.progmatic.physics;

// import alias: Mostantól a hu.progmatic.travel.cargo.Water-t Water-nek hívjuk.
// import hu.progmatic.travel.cargo.Water;
// FQN

import hu.progmatic.travel.cargo.Water;
import hu.progmatic.travel.cargo.WaterOld;

public class App {
    public static void main(String[] args) {
        WaterOld water1 = new WaterOld();
        water1.setVolume(10.0);
        water1.setUnitPrice(100.0);

        hu.progmatic.physics.material.Water w2 = new hu.progmatic.physics.material.Water();

        WaterOld wx;
        System.out.println(water1.getVolume());
    }
}
