package de.codecentric.springaopnegationissuedemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Around("target(de.codecentric.springaopnegationissuedemo.SpringAopNegationIssueDemoApplication) && execution(* *.*(..)) && !target(org.springframework.web.filter.GenericFilterBean)")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }
}
