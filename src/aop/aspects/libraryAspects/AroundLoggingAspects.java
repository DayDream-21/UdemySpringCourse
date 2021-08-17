package aop.aspects.libraryAspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspects {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "the book is returning to the library");
        // For proper work we should use method proceed() on pjp (ProceedingJoinPoint) and return Object (or another
        // parent type for returning type of our method) from advice method or else we get null from returnBook
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Crime and Punishment"; // We also can change the result

        System.out.println("aroundReturnBookLoggingAdvice: " +
                "the book is successfully returned to the library");

        return targetMethodResult;
    }
}
