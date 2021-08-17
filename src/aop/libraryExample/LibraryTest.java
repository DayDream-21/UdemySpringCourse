package aop.libraryExample;

import aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book myBook = context.getBean("bookBean", Book.class);
        TownLibrary myTownLibrary = context.getBean("townLibraryBean", TownLibrary.class);

        myTownLibrary.getBook();
        myTownLibrary.addBook("Andrew", myBook);
        myTownLibrary.addMagazine();

        context.close();
    }
}
