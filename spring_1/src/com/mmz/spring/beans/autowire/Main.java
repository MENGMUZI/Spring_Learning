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

        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("beans-relations.xml");

        Person person = (Person) ctx.getBean("person");

        System.out.println(person);

        person = (Person) ctx.getBean("person2");

        System.out.println(person);

        //person = (Person) ctx.getBean("person3");
        //System.out.println(person);

        Address address = (Address) ctx1.getBean("address");

        System.out.println(address);

        address = (Address) ctx1.getBean("address2");

        System.out.println(address);

        address = (Address) ctx1.getBean("address3");

        System.out.println(address);

        address = (Address) ctx1.getBean("childaddress");

        System.out.println(address);

        person = (Person) ctx1.getBean("person");
        System.out.println(person);


    }

}
