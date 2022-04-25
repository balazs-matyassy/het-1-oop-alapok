package hu.progmatic.club_03_inheritance;

public class GoldClubcard extends Clubcard {
    public GoldClubcard() {
        super();
    }

    public GoldClubcard(Person owner, String expiration, int admissions) {
        super(owner, expiration, admissions);
    }

    @Override
    public int getTotalPrice() {
        return 25000;
    }

    @Override
    public String getCardType() {
        return "Gold";
    }
}
