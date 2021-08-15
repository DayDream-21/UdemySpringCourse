package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class AbstractLibrary {
}

@Component("townLibraryBean")
class TownLibrary extends AbstractLibrary {
    public void getBook(Book book) {
        System.out.println("We take book from Town Library. Name: "
                + book.getName());
    }

    public void getMagazine(int idMagazine) {
        System.out.println("We take magazine from Town Library. ID: "
                + idMagazine);
    }
}
