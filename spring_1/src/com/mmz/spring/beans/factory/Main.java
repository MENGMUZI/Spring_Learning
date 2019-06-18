package com.mmz.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  21:43
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car = (Car) ctx.getBean("car");

        System.out.println(car);

        car = (Car) ctx.getBean("car2");

        System.out.println(car);

    }

}
