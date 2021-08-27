package hibernate_associations.many_to_many;

import hibernate_associations.many_to_many.entity.Child;
import hibernate_associations.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

            Section section = session.get(Section.class, 1);

            System.out.println("Sections: ");
            System.out.println(section);

            System.out.println("Children in this section: ");
            System.out.println(section.getChildren());

            session.getTransaction().commit();
        }
    }
}
