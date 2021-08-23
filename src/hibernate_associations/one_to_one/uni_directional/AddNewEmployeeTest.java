package hibernate_associations.one_to_one.uni_directional;

import hibernate_associations.one_to_one.uni_directional.entity.Detail;
import hibernate_associations.one_to_one.uni_directional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewEmployeeTest {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Smirnov",
                    "HR", 700);
            Detail detail = new Detail("Moscow", "9855254279",
                    "oleg_smirnov@gmail.com");

            employee.setEmployeeDetail(detail);

            session.save(employee);

            session.getTransaction().commit();
        }
    }
}
