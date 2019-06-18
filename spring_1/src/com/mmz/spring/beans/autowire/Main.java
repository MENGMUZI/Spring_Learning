package com.mmz.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  14:28
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person person = (Person) ctx.getBean("person");

        System.out.println(person);

        person = (Person) ctx.getBean("person2");

        System.out.println(person);

        //person = (Person) ctx.getBean("person3");
        //System.out.println(person);

    }

}
