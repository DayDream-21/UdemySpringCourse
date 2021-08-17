package aop.libraryExample;

import aop.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        TownLibrary myTownLibrary = context.getBean("townLibraryBean", TownLibrary.class);

        String bookName = myTownLibrary.returnBook();
        System.out.println(bookName + " is returned to the library");

        context.close();
        System.out.println("Method main ends");
    }
}
