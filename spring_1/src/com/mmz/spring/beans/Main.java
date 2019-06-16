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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2. 从 IOC 容器中获取 bean 的实例
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3. 使用 bean
        //helloWorld.hello();





    }

}
