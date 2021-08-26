package hibernate_associations.one_to_many;

import hibernate_associations.one_to_many.entity.Department;
import hibernate_associations.one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetEmployeeTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
            Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmployees());

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
        }
    }
}
