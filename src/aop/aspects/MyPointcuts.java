package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*(..)) && !execution(* getStudents()) && !execution(* addStudents())")
    public void allAddMethods() {}
}
