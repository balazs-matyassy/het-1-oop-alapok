package hu.progmatic.club_02_inheritance;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("001", "Józsi", 25);
        Person p2 = new Person("002", "Pista", 42);
        Person p3 = new Person("003", "Anna", 33);
        BronzeClubcard bc = new BronzeClubcard(p1, "2250.01.01.", 35);
        SilverClubcard sc = new SilverClubcard(p2, "2250.01.01.", 35);
        GoldClubcard gc = new GoldClubcard(p3, "2250.01.01.", 35);

        System.out.println(bc);
        System.out.println(sc);
        System.out.println(gc);

        Person p4 = new Person("003", "Annácska", 12);

        // nem az állapotot definiáltuk egyenlőnek, hanem az embert
        // az ember nem változik a korral
        if (p4.equals(p3)) {
            System.out.println("Anna felnőttként is Annácska marad.");
        }
    }
}
