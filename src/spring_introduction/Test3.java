package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();

        context.close();
    }
}
