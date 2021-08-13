package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // In pointcut we must declare only return type and method name.
    // Other stuff is optional
    // * - works as the same as in regex
    @Before("execution(public void aop.*Library.get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: " +
                "attempt to get book");
    }
    // We can write regex (here it's just *) even for return type, class/package and etc.
    // If we accept any access modifier (public, private, ...) we can just delete it
    @Before("execution(* aop.*Library.return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: " +
                "attempt to return book");
    }
}
