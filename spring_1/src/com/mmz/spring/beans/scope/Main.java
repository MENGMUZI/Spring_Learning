package com.mmz.spring.beans.scope;

import com.mmz.spring.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  16:17
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");

        //作用域是single模式
        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");

        System.out.println(car);
        System.out.println(car == car2);//true

        //作用域是prototype
        car = (Car) ctx.getBean("car2");

        car2 = (Car) ctx.getBean("car2");

        System.out.println(car == car2);
    }

}
