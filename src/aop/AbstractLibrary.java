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

    public void getMagazine() {
        System.out.println("We take magazine from Town Library.");
    }
}
