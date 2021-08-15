package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class AbstractLibrary {
}

@Component("townLibraryBean")
class TownLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take book from Town Library.");
    }

    public void returnBook() {
        System.out.println("We return book to Town Library");
    }

    public void getMagazine() {
        System.out.println("We take magazine from Town Library.");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to Town Library.");
    }

    public void addBook() {
        System.out.println("We add book to Town Library");
    }

    public void addMagazine() {
        System.out.println("We add magazine to Town Library");
    }
}
