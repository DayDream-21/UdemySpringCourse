package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            /*Employee employee = session.get(Employee.class, 1);
            session.delete(employee);*/

            session.createQuery("delete Employee " +
                    "where salary < 600").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
