package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");

        Person myPerson = context.getBean("personBean", Person.class);

        myPerson.callYourPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
}
