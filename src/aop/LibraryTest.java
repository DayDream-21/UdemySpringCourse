package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        TownLibrary myTownLibrary = context.getBean("townLibraryBean", TownLibrary.class);

        myTownLibrary.getBook();
        myTownLibrary.getMagazine();

        context.close();
    }
}
