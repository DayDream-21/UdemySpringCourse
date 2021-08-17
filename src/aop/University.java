package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("universityBean")
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Abobus", 2, 4.3);
        Student student2 = new Student("Amogus", 1, 3.7);
        Student student3 = new Student("Autobus", 3, 4.9);
        students.addAll(Arrays.asList(student1, student2, student3));
    }

    public List<Student> getStudents() {
        System.out.println("Info from method getStudents:");
        System.out.println(students);
        return students;
    }
}
