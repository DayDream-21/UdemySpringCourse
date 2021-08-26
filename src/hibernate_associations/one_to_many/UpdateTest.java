package hibernate_associations.one_to_many;

import hibernate_associations.one_to_many.entity.Department;
import hibernate_associations.one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

            session.createQuery("update Department set max_salary = 1200, min_salary = 300 " +
                    "where name = 'IT'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
