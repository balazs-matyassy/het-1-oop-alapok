package hu.progmatic.konyvekhazi.models;

public class Author {
    private String name;
    private String country;
    private int birthYear;

    public Author() {
    }

    public Author(String name, String country, int birthYear) {
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public void printInfo() {
        System.out.println("Név:\t\t\t" + name);
        System.out.println("Származás:\t\t" + country);
        System.out.println("Születési év:\t" + birthYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
