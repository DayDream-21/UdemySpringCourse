package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // In pointcut we must declare only return type and method name.
    // Other stuff is optional. If method has parameter(s) we should declare it.
    // * - works as the same as in regex
    // .. in parameter means that pointcut will work with any numbers of any
    // parameters (even zero).
    @Before("execution(public void aop.*Library.get*(aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: " +
                "attempt to get book");
    }
    // We can write regex (here it's just *) even for return type, class/package etc.
    // If we accept any access modifier (public, private, ...) we can just delete it
    //@Before("execution(* aop.*Library.return*())")
    //public void beforeReturnBookAdvice() {
    //    System.out.println("beforeReturnBookAdvice: " +
    //            "attempt to return book");
    //}
}
