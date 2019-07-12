package com.mmz.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  17:27
 * @description: 如何将这个类（切面类）的方法（通知方法）动态的在目标方法中运行切入
 * 告诉Spring每个方法都什么时候运行,有如下注解
 * @Before: 前置通知
 * @After： 后置通知
 * @AfterReturning： 返回通知
 * @AfterThrowing： 异常通知
 * @Around: 环绕通知
 *
 */

@Component
@Aspect
public class LogUtils {

    //切入点表达式
    //execution(访问权限符，返回值类型，方法签名)
    //可以加入通配符 * ，匹配一个多个字符   execution(public int com.mmz.impl.MyMathCalculator.*(int, int))
    //可以匹配任意一个参数，第一个是int类型，第二个任意类型 execution(public int com.mmz.impl.MyMathCalculator.*(int, *))
    //可以匹配多个参数，任意类型参数 execution(public int com.mmz.impl.MyMathCalculator.*(..))
    //可以匹配多层路径 execution(public int com.mmz..MyMathCalculator.*(..))
    //权限位置



    @Before("execution(public int com.mmz.impl.MyMathCalculator.*(int, int))")
    public static void logStart(){
        System.out.println( " 方法开始执行，用的参数列表是：");
    }
    @AfterReturning("execution(public int com.mmz.impl.MyMathCalculator.*(int, int)))")
    public static void logReturn(){
        System.out.println(" 方法执行完成，执行的结果是：" );
    }
    @AfterThrowing("execution(public int com.mmz.impl.MyMathCalculator.*(int, int))")
    public static void logException(){
        System.out.println(" 方法执行出现异常，异常的结果是：");
    }
    @After("execution(public int com.mmz.impl.MyMathCalculator.*(int, int))")
    public static void logEnd(){
        System.out.println(" 方法最终执行完成 ");
    }

}
