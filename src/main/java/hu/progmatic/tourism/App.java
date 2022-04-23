package hu.progmatic.tourism;

public class App {
    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Föld", 0, 0, 0),
                new Planet("Mars", 251_000_000, 0, 0),
                new Planet("Hold", 384_400, 0, 0)
        };
        Travel[] travels = {
                new Travel(planets[0], planets[1], 3.5, 1000),
                new Travel(planets[1], planets[2], 0.5, 250),
                new Travel(planets[2], planets[0], 3.0, 750)
        };

        for (Travel travel : travels) {
            System.out.println("====================");
            System.out.println(travel.getInfoSheet());
            System.out.println();
        }
    }
}
