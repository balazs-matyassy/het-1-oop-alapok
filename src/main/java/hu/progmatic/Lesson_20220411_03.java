package hu.progmatic;

public class Lesson_20220411_03 {
    public static void main(String[] args) {
        Travel moonTravel = new Travel();
        moonTravel.from = "Föld";
        moonTravel.to = "Hold";
        moonTravel.time = 100;
        moonTravel.price = 1000;

        Travel marsTravel = new Travel("Föld", "Mars", 350, 3500);

        travelData(moonTravel);
        travelData(marsTravel);
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
