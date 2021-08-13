package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        AbstractLibrary myUniLibrary = context.getBean("uniLibraryBean", AbstractLibrary.class);
        AbstractLibrary myTownLibrary = context.getBean("townLibraryBean", AbstractLibrary.class);

        myUniLibrary.getBook();
        myUniLibrary.returnBook();
        myTownLibrary.getBook();
        myTownLibrary.returnBook();

        context.close();
    }
}
