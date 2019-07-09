package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  11:04
 * @description: 根据bean的类型从IOC容器中获取bean的实例
 *
 * 如果容器中这个类型的bean有多个，按照类型查找就会报错
 */
public class Test02 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        //NoUniqueBeanDefinitionException: No qualifying bean of type 'com.mmz.Person' available:
        //Person personBean = ioc.getBean(Person.class);

        Person personBean = ioc.getBean("person02",Person.class);

        System.out.println(personBean);
    }
}
