package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  17:45
 * @description: 创建带有生命周期方法的bean
 *      单例：生命周期：（容器启动）构造器--》初始化方法--》（容器关闭）销毁方法
 *      多例：生命周期： 获取Bean时构造器--》初始化方法--》 容器关闭的时候不会调用bean的销毁方法
 */
public class Test10 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Book book02 = (Book) ioc.getBean("book02");

        System.out.println(book02);

        ((ClassPathXmlApplicationContext) ioc).close();


    }

}
