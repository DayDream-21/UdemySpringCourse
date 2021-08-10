package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
// Scope test
// Singleton - default scope, works as the same as pattern Singleton. Creates one bean even
// before we first time use method getBean. Useful for stateless objects.
// Prototype - creates new bean every time, and only(!) we use method getBean. Useful for stateful objects.
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Abobus");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Amogus");

        System.out.println("dog & yourDog referred on the same object? "
                + (dog == yourDog));
        System.out.println(dog.getName() + " Address = " + dog);
        System.out.println(yourDog.getName() + " Address = " + yourDog);

        context.close();
    }
}
