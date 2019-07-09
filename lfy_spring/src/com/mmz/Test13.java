package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  18:52
 * @description:
 */
public class Test13 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person bean16 = (Person) ioc.getBean("person16");

        System.out.println(bean16);
    }

}
