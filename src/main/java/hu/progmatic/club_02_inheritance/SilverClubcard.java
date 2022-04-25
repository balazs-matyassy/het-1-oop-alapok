package hu.progmatic.club_02_inheritance;

public class SilverClubcard extends BronzeClubcard {
    @Override
    public int getTotalPrice() {
        return getAdmissions() * 1000;
    }

    @Override
    public String getCardType() {
        return "Silver";
    }
}
