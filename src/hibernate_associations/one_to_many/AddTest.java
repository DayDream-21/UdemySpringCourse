package hibernate_associations.one_to_many;


import hibernate_associations.one_to_many.entity.Department;
import hibernate_associations.one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddTest {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession()){
            Department department = new Department("Sales", 500, 900);
            Employee employee1 = new Employee("Anton", "Sidorov", 850);
            Employee employee2 = new Employee("Igor", "Bashirov", 800);
            Employee employee3 = new Employee("Andrew", "Petrov", 790);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            department.addEmployeeToDepartment(employee3);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
        }
    }
}
