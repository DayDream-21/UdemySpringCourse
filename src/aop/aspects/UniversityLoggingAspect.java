package aop.aspects;

import aop.universityExample.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: " +
                "logging the receipt of the list of students " +
                "before method getStudents()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String name = firstStudent.getName();
        name = "Mr. " + name;
        firstStudent.setName(name);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 0.3;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterReturningStudentsLoggingAdvice: " +
                "logging the receipt of the list of students " +
                "after returning method getStudents()");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
                "logging the throw of " + exception);
    }
}
