package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.configuration.ProjectConfiguration;
import org.example.services.CommentService;

import java.util.Objects;
import java.util.logging.Logger;

@Aspect
public class LoggingAspects {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @Around(("execution(* org.example.services.*.*(..))"))
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Method will executed");
        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed");
        return returnedByMethod;
    }
}
