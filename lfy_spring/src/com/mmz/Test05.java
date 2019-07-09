package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  15:17
 * @description: 通过继承实现bean配置信息的重用
 */
public class Test05 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person personBean14 = (Person) ioc.getBean("person14");
        Person personBean15 = (Person) ioc.getBean("person15");

        System.out.println(personBean14);
        System.out.println(personBean15);

    }


}
