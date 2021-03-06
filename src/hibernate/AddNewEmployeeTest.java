package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewEmployeeTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Elena", "Kojemyatko",
                    "IT", 515);

            session.beginTransaction();
            session.save(employee);

            int myId = employee.getId();
            Employee employee1 = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee1);
        }

    }
}
