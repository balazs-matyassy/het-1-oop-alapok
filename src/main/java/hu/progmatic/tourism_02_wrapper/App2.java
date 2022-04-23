package hu.progmatic.tourism_02_wrapper;

public class App2 {
    public static void main(String[] args) {
        Planet earth = new Planet("Föld", 0, 0, 0);
        Planet mars = new Planet("Mars", 251_000_000, 0, 0);
        Planet moon = new Planet("Hold", 384_400, 0, 0);
        Travel earthMars = new Travel(earth, mars, 3.5, 1000);
        Travel marsMoon = new Travel(mars, moon, 0.5, 250);
        Travel moonEarth = new Travel(moon, earth, 3.0, 750);

        System.out.println("====================");
        System.out.println(earthMars.getInfoSheet());
        System.out.println();

        System.out.println("====================");
        System.out.println(marsMoon.getInfoSheet());
        System.out.println();

        System.out.println("====================");
        System.out.println(moonEarth.getInfoSheet());
        System.out.println();

        Integer cheapest = 2500;
        Integer mostExpensive = 2500;

        // == nem jó, mert az a referenciákat hasonlítja össze
        if (cheapest.equals(mostExpensive)) {
            System.out.println("Csak egyféle ár van.");
        }

        // unboxing
        // int cheapestP = cheapest.intValue();
        int cheapestP = cheapest;
        cheapestP -= 1000;

        // autoboxing
        // cheapest = Integer.valueOf(cheapestP);
        cheapest = cheapestP;

        // miért nem az eredeti objektum értékét állítjuk?
        // immutable
        Integer balance = 1000;
        // bank.setBalance(balance);

        // ha nem lenne immutable,
        // akkor utólag a bank tudta nélkül meg lehetne változtatni az egyenleget
        // balance.setValue(100_000_000);
        // mivel csak referencia szintjén adtam át a banknak, emiatt megváltozna az érték

        Integer unknown = null;
    }
}
