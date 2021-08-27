package hibernate_associations.many_to_many;

import hibernate_associations.many_to_many.entity.Child;
import hibernate_associations.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();
            Child child1 = session.get(Child.class, 9);
            Section section1 = session.get(Section.class, 1);

            child1.addSectionToChild(section1);

            //session.save(section1);
            // if CascadeType != All => use persist method
            session.persist(child1);

            session.getTransaction().commit();
        }
    }
}
