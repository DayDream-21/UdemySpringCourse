package aop.libraryExample;

import org.springframework.stereotype.Component;

public abstract class AbstractLibrary {
}

@Component("townLibraryBean")
class TownLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take book from Town Library.");
        System.out.println("----------------------------------------");
    }

    public String returnBook() {
        // Throwing exception
        // double a = 10 / 0;
        System.out.println("We return book to Town Library");
        return "War and Peace";
    }

    public void getMagazine() {
        System.out.println("We take magazine from Town Library.");
        System.out.println("----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to Town Library.");
        System.out.println("----------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book to Town Library");
        System.out.println("----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine to Town Library");
        System.out.println("----------------------------------------");
    }
}
