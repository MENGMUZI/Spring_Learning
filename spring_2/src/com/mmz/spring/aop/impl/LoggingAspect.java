package com.mmz.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  16:42
 * @description: AOP日志切面
 */
//把这个类声明为一个切面，需要把该类放入IOC容器中，再声明一个切面
@Aspect
@Component
public class LoggingAspect {

    //声明该方法是前置通知：在目标方法开始之前执行
    @Before("execution(public int com.mmz.spring.aop.impl.ArithmeticCalculator.* (int,int))")

    /*
    public void beforeMethod(){
        System.out.println("The method begins");

    }
    */

    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("The method: " + methodName + " begins with: " + args);
    }
}
