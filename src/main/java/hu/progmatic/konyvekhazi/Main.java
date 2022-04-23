package hu.progmatic.konyvekhazi;

import hu.progmatic.konyvekhazi.models.Author;
import hu.progmatic.konyvekhazi.models.Book;

public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Tolkien", "Anglia", 1892);
        Author rowling = new Author("Rowling", "Anglia", 1965);

        Book lotr = new Book();
        lotr.setAuthor(tolkien);
        lotr.setTitle("Gyűrűk Ura");
        lotr.setPublished(1954);
        lotr.setGenre("fantasy");

        lotr.printInfo();

        Book hp = new Book(rowling, "Harry Potter", 1997, "fantasy");

        hp.printInfo();
    }
}
