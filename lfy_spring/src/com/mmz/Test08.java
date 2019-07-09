package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  15:45
 * @description: 重要！！！！！！！！！测试bean的作用域，分别创建单实例和多实例的bean
 *
 * bean的作用域：指定bean是否为单实例，默认是单实例
 *             scope="prototype" 是多实例 容器启动之前不会创建对象，每次获取的时候才会创建新的实例
 *             scope="singleton" 是单实例（默认）在容器启动之前就已经创建好了对象
 */
public class Test08 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Book book = (Book) ioc.getBean("bookPrototype");
        Book book0 = (Book) ioc.getBean("bookPrototype");

        System.out.println(book == book0);//false


    }

}
