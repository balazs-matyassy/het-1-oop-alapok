package hu.progmatic.club_03_inheritance;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("001", "Józsi", 25);
        Person p2 = new Person("002", "Pista", 42);
        Person p3 = new Person("003", "Anna", 33);
        Clubcard[] clubcards = {
                new BronzeClubcard(p1, "2250.01.01.", 35),
                new SilverClubcard(p2, "2250.01.01.", 35),
                new GoldClubcard(p3, "2250.01.01.", 35)
        };

        int total = 0;

        for (Clubcard clubcard : clubcards) {
            System.out.println(clubcard);
            total += clubcard.getTotalPrice();
        }

        System.out.println(total);
    }
}
