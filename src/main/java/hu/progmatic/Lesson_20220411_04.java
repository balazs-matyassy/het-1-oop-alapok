package hu.progmatic;

public class Lesson_20220411_04 {
    public static void main(String[] args) {
        Travel[] travels = {
                new Travel("Föld", "Hold", 100, 1000),
                new Travel("Föld", "Mars", 350, 3500),
                new Travel("Hold", "Z123", 2500, 21000)
        };

        Travel mostExpensive = null;

        // rövidzáras kiértékelés (short-circuit)
        for (Travel travel : travels) {
            if (mostExpensive == null || travel.price > mostExpensive.price) {
                mostExpensive = travel;
            }
        }

        System.out.println("A legdrágább utazás adatai:");
        travelData(mostExpensive);
    }

    public static void travelData(Travel travel) {
        System.out.println("=========================");
        System.out.println("Indulás: " + travel.from);
        System.out.println("Cél: " + travel.to);
        System.out.println("Hossz: " + travel.time);
        System.out.println("Ár: " + travel.price);
        System.out.println();
    }
}
