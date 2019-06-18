package com.mmz.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-17  21:48
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) ctx.getBean("person4");

        System.out.println(person);

        NewPerson newPerson = (NewPerson) ctx.getBean("person5");

        System.out.println(newPerson);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getProperties());

        person = (Person) ctx.getBean("person6");
        System.out.println(person);
    }

}
