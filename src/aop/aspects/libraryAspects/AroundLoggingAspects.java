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
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception exception) {
            System.out.println("aroundReturnBookLoggingAdvice: " +
                    exception + " was logged");
            // We can handle this exception
            //targetMethodResult = "Unknown name";
            // Or (better!) rethrow exception into main with logging
            throw exception;
        }
        // If exception caught and rethrow further than that advice ends his work
        System.out.println("aroundReturnBookLoggingAdvice: " +
                "the book is successfully returned to the library");

        return targetMethodResult;
    }
}
