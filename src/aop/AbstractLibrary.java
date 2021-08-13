package aop;

import org.springframework.stereotype.Component;

public abstract class AbstractLibrary {
    abstract public void getBook();
    abstract public void returnBook();
}

@Component("townLibraryBean")
class TownLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We take book from" +
                " Town Library");
    }

    @Override
    public void returnBook() {
        System.out.println("We return book to" +
                " Town Library");
    }
}

@Component("uniLibraryBean")
class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("We take a book from" +
                " University Library");
    }

    @Override
    public void returnBook() {
        System.out.println("We return book to" +
                " University Library");
    }
}