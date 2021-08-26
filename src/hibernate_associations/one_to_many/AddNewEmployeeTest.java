package hibernate_associations.one_to_many;


import hibernate_associations.one_to_many.entity.Department;
import hibernate_associations.one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewEmployeeTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession()){
            Department department = new Department("IT", 300, 1200);
            Employee employee1 = new Employee("Zaur", "Tregulov", 800);
            Employee employee2 = new Employee("Elena", "Smirnova", 750);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
        }
    }
}
