package com.mmz.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

/**
 * @author : mengmuzi
 * create at:  2019-07-12  11:26
 * @description: 验证切面
 */

public class ValidateAspect {


    public static void logStart(JoinPoint joinPoint){
        //获取到目标方法运行使用的参数
        Object[] args = joinPoint.getArgs();
        //获取到方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println( "ValidateAspect " + name + " 方法开始执行，用的参数列表是：" + Arrays.asList(args));
    }

    public static void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("ValidateAspect " + joinPoint.getSignature().getName() + " 方法执行完成，执行的结果是：" + result);
    }

    public static void logException(JoinPoint joinPoint, Exception e){
        System.out.println("ValidateAspect " + joinPoint.getSignature().getName() + " 方法执行出现异常，异常的结果是：" + e);
    }

    public static void logEnd(JoinPoint joinPoint){
        System.out.println("ValidateAspect " + joinPoint.getSignature().getName() + " 方法最终执行完成 ");
    }



}
