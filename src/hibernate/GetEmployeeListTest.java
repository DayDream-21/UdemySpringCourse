package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetEmployeeListTest {
    public static void main(String[] args) {
        // Try with resources close sessionFactory after work
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            /*List<Employee> employeeList = session.createQuery("from Employee")
                            .getResultList();*/

            /*List<Employee> employeeList = session.
                    createQuery("from Employee where name = 'Elena' AND salary > 500").
                    getResultList();

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }*/

            session.getTransaction().commit();
        }
    }
}
