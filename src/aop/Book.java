package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Amogus")
    private String name;

    public String getName() {
        return name;
    }
}
