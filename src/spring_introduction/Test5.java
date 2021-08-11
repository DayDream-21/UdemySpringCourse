package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// If scope = prototype then initMethod execute every time when we use method getBean,
// and in this case we should write code for closing by ourselves
public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        //Dog yourDog = context.getBean("myPet", Dog.class);

        myDog.say();

        context.close();
    }
}
