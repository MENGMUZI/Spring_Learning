package com.mmz.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-16  01:59
 * @description: HelloWorld
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 这个是利用spring框架要生成的效果
         * */
        //HelloWorld helloWorld = new HelloWorld();
        //helloWorld.setName("spring");
        //helloWorld.hello(); //hello:spring

        /**
         * 使用Spring框架过程
         * */
        //1. 创建 Spring 的 IOC 容器
        //ApplicationContext 代表IOC容器
        //ClassPathXmlApplicationContext：从类路径下加载配置文件，是ApplicationContext的一个实现类
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. 从 IOC 容器中获取 bean 的实例
        //利用id 定位到IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //利用类型返回IOC容器中的Bean，但是要求IOC容器中必须只能有一个该类型的Bean（有多个不知道该加载哪一个会出现错误）
        HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);

        System.out.println(helloWorld);
        System.out.println(helloWorld1);

        //3. 使用 bean
        helloWorld.hello();

        System.out.println("------------------------------------");
        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

    }

}
