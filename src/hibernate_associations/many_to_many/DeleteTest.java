package hibernate_associations.many_to_many;

import hibernate_associations.many_to_many.entity.Child;
import hibernate_associations.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeleteTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();

            Section section1 = session.get(Section.class, 2);
            session.delete(section1);

            session.getTransaction().commit();
        }
    }
}
