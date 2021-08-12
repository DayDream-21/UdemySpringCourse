package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(dogBean());
    }
}
