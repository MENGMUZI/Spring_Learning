package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  19:09
 * @description:  SpEL测试
 */
public class Test14 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person bean17 = (Person) ioc.getBean("person17");

        System.out.println(bean17);
    }

}
