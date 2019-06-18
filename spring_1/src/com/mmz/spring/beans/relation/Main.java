package com.mmz.spring.beans.relation;

import com.mmz.spring.beans.autowire.Address;
import com.mmz.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  16:14
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relations.xml");

        Address address = (Address) ctx.getBean("address");

        System.out.println(address);

        address = (Address) ctx.getBean("address2");

        System.out.println(address);

        address = (Address) ctx.getBean("address3");

        System.out.println(address);

        address = (Address) ctx.getBean("childaddress");

        System.out.println(address);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

}
