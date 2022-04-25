package hu.progmatic.racepod_01_practice;

public class App {
    public static void main(String[] args) {
        RacePod.setSpeedLimit(500);
        RacePod[] racePods = {
                new RacePod("RP1", -50, true),
                new RacePod("RP2", 1500, true),
                new RacePod("RP3", 1000, false)
        };

        for (RacePod racePod : racePods) {
            System.out.println(racePod);
        }

        RacePod fastest = null;
        int speedSum = 0;

        for (RacePod racePod : racePods) {
            // akkor írja felül, ha az első iterációban járunk (akkor mindig null) VAGY
            // találtunk egy gyorsabbat
            if (fastest == null || racePod.getSpeed() > fastest.getSpeed()) {
                fastest = racePod;
            }

            speedSum += racePod.getSpeed();
        }

        System.out.println("Leggyorsabb:");
        System.out.println(fastest);
        System.out.println("Átlag: " + speedSum / racePods.length);
    }
}
