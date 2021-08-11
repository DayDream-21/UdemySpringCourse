package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.name}")
    String name;
    @Value("${person.age}")
    int age;

    /*@Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
    }*/

    @Autowired
    public void setPet(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
    }

    public void info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public void callYourPet() {
        System.out.println("Hello!");
        pet.say();
    }
}
