package com.mmz.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  16:42
 * @description: AOP日志切面
 */
//把这个类声明为一个切面，需要把该类放入IOC容器中，再声明一个切面
@Order(2)
@Aspect
@Component
public class LoggingAspect {

    /**
     * 定义一个方法，用于声明切入点表达式，一般的，该方法中不需要兼容其他代码
     * 重用切点表达式
     *
     * */
    @Pointcut("execution(public int com.mmz.spring.aop.xml.ArithmeticCalculator.*(..))")
    public void declareJointPointExpression(){

    }

    //声明该方法是前置通知：在目标方法开始之前执行
    @Before("declareJointPointExpression()")

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



    //后置通知：在目标方法执行后(无论是否发生异常)，执行通知
    //在后置通知中还不能访问目标方法执行的结果
    @After("declareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method: " + methodName + " ends");
    }


    //在方法正常结束受执行的代码
    //返回通知是可以访问到方法的返回值的
    @AfterReturning(value="declareJointPointExpression()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method: " + methodName + " ends with: " + result);

    }


    //在目标方法出现异常时会执行的代码
    //可以访问的对象，且可以指定在出现特定异常时再执行通知代码
    @AfterThrowing(value = "declareJointPointExpression()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The method '" + methodName + " occurs exception:  " + e);
    }


    //环绕通知需要携带ProceedingJoinPoint 类型的参数，类似于动态代理全工程，ProceedingJoinPoint类型的参数可以决定是否执行目标方法
    //环绕通知必须有返回值


    @Around("declareJointPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint pjd){
        Object result = null;
        String methodName = pjd.getSignature().getName();

        //执行目标方法
        try{
            //前置通知
            System.out.println(
                    "aroundMethod The method " + methodName + " begins with " + Arrays.asList(pjd.getArgs()));

            //执行目标方法
            result = pjd.proceed();

            //返回通知
            System.out.println("aroundMethod The method " + methodName + " ends with " + result);

        }catch (Throwable e){
            //异常通知
            System.out.println("aroundMethod The method " + methodName + " occurs exception: " + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("aroundMethod The method " + methodName + " ends");

        return result;

    }
}
