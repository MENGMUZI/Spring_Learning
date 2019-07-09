package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  16:06
 * @description: 配置通过静态工厂创建的bean，实例工厂方法创建的bean，FactoryBean
 *
 * 不是利用反射机制，而是使用工厂内部创建对象
 */
public class Test09 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        AirPlane airPlane01 = (AirPlane) ioc.getBean("airPlane01");

        System.out.println(airPlane01);

        AirPlane airPlane02 = (AirPlane) ioc.getBean("airPlane02");

        System.out.println(airPlane02);


        //利用FactoryBean创建
        Book book = (Book) ioc.getBean("myFactoryBeanImple");

        Book book0 = (Book) ioc.getBean("myFactoryBeanImple");

        System.out.println(book == book0);//isSingleton()方法中返回的是false，不是单例，所以这里是false


    }


}
