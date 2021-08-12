package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person myPerson = context.getBean("personBean", Person.class);

        myPerson.callYourPet();
        System.out.println(myPerson.getName());
        System.out.println(myPerson.getAge());

        context.close();
    }
}
