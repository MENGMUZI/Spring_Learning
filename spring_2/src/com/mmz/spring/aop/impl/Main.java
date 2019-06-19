package com.mmz.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  16:38
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        //1.创建Spring的IOC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从容器中获取Bean实例
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");

        //3.使用bean
        int result = arithmeticCalculator.add(3,6);

        System.out.println("result: " + result);

        int result2 = arithmeticCalculator.div(10,2);

        System.out.println("result2: " + result2);
    }



}
