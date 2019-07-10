package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:37
 * @description:  实验17：使用context：exclude-filter指定扫描包时不包含的类
 */
public class Test17 {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        //ID是类名的首字母小写
        //NoSuchBeanDefinitionException: No bean named 'bookServlet' available
        Object bean01 = ioc.getBean("bookServlet");
        Object bean02 = ioc.getBean("bookServlet");


        System.out.println(bean01);

        System.out.println(bean01 == bean02);//true


    }

}
