package spring_introduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
