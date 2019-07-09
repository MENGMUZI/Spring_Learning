package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  11:14
 * @description: 通过构造器为bean的属性赋值
 */
public class Test03 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person bean03 = (Person) ioc.getBean("person03");

        System.out.println(bean03);

        Person bean04 = (Person) ioc.getBean("person04");

        System.out.println(bean04);

    }
}
