package hu.progmatic.club_03_inheritance;

public class BronzeClubcard extends Clubcard {
    public BronzeClubcard() {
        super();
    }

    public BronzeClubcard(Person owner, String expiration, int admissions) {
        super(owner, expiration, admissions);
    }

    @Override
    public int getTotalPrice() {
        return getAdmissions() * 1000;
    }

    @Override
    public String getCardType() {
        return "Bronze";
    }
}
