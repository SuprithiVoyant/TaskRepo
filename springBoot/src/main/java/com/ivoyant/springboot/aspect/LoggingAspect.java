package com.ivoyant.springboot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {

    private final static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.ivoyant.springboot.service.*.*(..))")
    public void logsBefore(){
        logger.info("Executing...");
    }

    @After("execution(* com.ivoyant.springboot.service.*.*(..))")
    public void logsAfter(){
        logger.info("Executed...");
    }

    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public Object forGet(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("GET Method is invoked");
        return joinPoint.proceed();
    }

    @Around("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public Object forPost(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("POST Method is invoked");
        return joinPoint.proceed();
    }

    @Around("@annotation(org.springframework.web.bind.annotation.PutMapping)")
    public Object forPut(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("PUT Method is invoked");
        return joinPoint.proceed();
    }

    @Around("@annotation(org.springframework.web.bind.annotation.PatchMapping)")
    public Object forPatch(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("PATCH Method is invoked");
        return joinPoint.proceed();
    }

    @Around("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public Object forDelete(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("DELETE Method is invoked");
        return joinPoint.proceed();
    }
}
