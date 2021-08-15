package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    /*@Pointcut("execution(* aop.TownLibrary.get*())")
    private void allGetMethodsFromTownLibrary() {
    }

    @Pointcut("execution(* aop.TownLibrary.return*())")
    private void allReturnMethodsFromTownLibrary() {
    }

    @Pointcut("allGetMethodsFromTownLibrary() || allReturnMethodsFromTownLibrary()")
    private void allGetAndReturnMethodsFromTownLibrary() {
    }*/

    @Pointcut("execution(* aop.TownLibrary.return*()) || execution(* aop.TownLibrary.get*())")
    private void allGetOrReturnMethodsFromTownLibrary() {
    }

    /*@Before("allGetMethodsFromTownLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromTownLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }*/

    @Before("allGetOrReturnMethodsFromTownLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #3");
    }
}
