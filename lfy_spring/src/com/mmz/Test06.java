package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  15:30
 * @description: 通过abstract属性创建一个模板bean
 */
public class Test06 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        //BeanIsAbstractException: Error creating bean with name 'person14': Bean definition is abstract

        Person personBean14 = (Person) ioc.getBean("person14");
        Person personBean15 = (Person) ioc.getBean("person15");

        System.out.println(personBean14);
        System.out.println(personBean15);
    }

}
