package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: " +
                "logging of attempt to get a book/magazine");
    }

    /*@Pointcut("execution(* aop.TownLibrary.return*()) || execution(* aop.TownLibrary.get*())")
    private void allGetOrReturnMethodsFromTownLibrary() {
    }

    @Before("allGetOrReturnMethodsFromTownLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #3");
    }*/
}
