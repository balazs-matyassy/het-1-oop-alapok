package hu.progmatic.tourism_04_tostring;

public class App {
    public static void main(String[] args) {
        Travel.setPresident("Gyula");
        Travel.elect("Balázs", "Ria", 2000, 3000);

        Planet[] planets = {
                new Planet("001", "Föld", 0, 0, 0),
                new Planet("002", "Mars", 251_000_000, 0, 0),
                new Planet("003", "Hold", 384_400, 0, 0)
        };
        Travel[] travels = {
                new Travel(planets[0], planets[1], 3.5, null),
                new Travel(planets[1], planets[2], 0.5, 250),
                new Travel(planets[2], planets[0], 3.0, 750)
        };

        for (Travel travel : travels) {
            System.out.println(travel);
            System.out.println();
        }
    }
}