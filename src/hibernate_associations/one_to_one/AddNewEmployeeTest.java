package hibernate_associations.one_to_one;

import hibernate_associations.one_to_one.entity.Detail;
import hibernate_associations.one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewEmployeeTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession()){

            Employee employee = new Employee("Nikolay", "Ivanov",
                    "Sales", 620);
            Detail detail = new Detail("New-York", "9752375478",
                    "nikIvanov@gmail.com");

            employee.setEmployeeDetail(detail);
            detail.setEmployeeInformation(employee);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
        }
    }
}
