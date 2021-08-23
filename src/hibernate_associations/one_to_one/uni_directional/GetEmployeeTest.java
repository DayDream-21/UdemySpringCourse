package hibernate_associations.one_to_one.uni_directional;

import hibernate_associations.one_to_one.uni_directional.entity.Detail;
import hibernate_associations.one_to_one.uni_directional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetEmployeeTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();
            /*Employee employee = session.get(Employee.class, 2);
            System.out.println(employee.getEmployeeDetail());*/

            Detail detail = session.get(Detail.class, 4);
            System.out.println(detail.getEmployeeInformation());

            session.getTransaction().commit();
        }
    }
}
