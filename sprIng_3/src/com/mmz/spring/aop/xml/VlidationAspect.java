package com.mmz.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  21:40
 * @description:  切面的优先级
 *
 * 在同一个连接点上应用不止一个切面时, 除非明确指定, 否则它们的优先级是不确定的.
 *
 * 切面的优先级可以通过实现 Ordered 接口或利用 @Order 注解指定.
 *
 * 实现 Ordered 接口, getOrder() 方法的返回值越小, 优先级越高.
 */

@Order(1)
@Aspect
@Component
public class VlidationAspect {

    @Before("LoggingAspect.declareJointPointExpression()")
    public void validateArgs(JoinPoint joinPoint){

        System.out.println("-->validate: " + Arrays.asList(joinPoint.getArgs()));

    }
}
