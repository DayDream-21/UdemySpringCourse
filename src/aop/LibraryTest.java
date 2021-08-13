package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library myLibrary = context.getBean("libraryBean", Library.class);

        myLibrary.getBook();

        context.close();
    }
}
