package com.mmz.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
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
    /**
     * 切入点表达式
     * execution(访问权限符，返回值类型，方法签名)
     * 可以加入通配符 * ，匹配一个多个字符   execution(public int com.mmz.impl.MyMathCalculator.*(int, int))
     * 可以匹配任意一个参数，第一个是int类型，第二个任意类型 execution(public int com.mmz.impl.MyMathCalculator.*(int, *))
     * 可以匹配多个参数，任意类型参数 execution(public int com.mmz.impl.MyMathCalculator.*(..))
     * 可以匹配多层路径 execution(public int com.mmz..MyMathCalculator.*(..))
     * 权限位置
     *
     * 抽取可重用的切入点表达式：
     * 1.随便声明一个没有实现的返回void的空方法
     * 2.给方法上标注@Pointcut的注解
     *
     */

    /**
     * 细节四：在通知方法运行的时候，拿到目标方法的详细信息
     *  1）只需要为通知方法的参数列表上写一个参数：JoinPoint
     *  JoinPoint joinPoint 封装了当前目标方法的详细信息
     *
     *
     * 细节五：throwing,returning来指定哪个参数用来接收异常，返回值
     *
     *
     * 细节六：Spring对通知方法的约束
     * 唯一要求是方法的参数列表不能乱写，通知方法是Spring利用反射调用的，每次方法调用得确定这个方法的参数表的值
     * 参数表上的每一个参数，Spring都要知道是什么
     *
     *
     */
    @Pointcut("execution(public int com.mmz.impl.MyMathCalculator.*(int, int)))")
    public void myPointCut(){}


    @Before("myPointCut()")
    public static void logStart(JoinPoint joinPoint){
        //获取到目标方法运行使用的参数
        Object[] args = joinPoint.getArgs();
        //获取到方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println( name + " 方法开始执行，用的参数列表是：" + Arrays.asList(args));
    }
    @AfterReturning(value = "myPointCut()",returning = "result")
    public static void logReturn(JoinPoint joinPoint, Object result){
        System.out.println(joinPoint.getSignature().getName() + " 方法执行完成，执行的结果是：" + result);
    }
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public static void logException(JoinPoint joinPoint, Exception e){
        System.out.println(joinPoint.getSignature().getName() + " 方法执行出现异常，异常的结果是：" + e);
    }
    @After("myPointCut()")
    public static void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 方法最终执行完成 ");
    }

}
