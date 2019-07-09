package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  10:35
 * @description: 测试Person类
 */
public class Main {

    //从容器中拿到这个组件
    public static void main(String[] args) {
        //ApplicationContext 代表IOC容器
        //ClassPathXmlApplicationContext 当前应用的xml文件在ClassPath下

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person personBean = (Person) ioc.getBean("person01");

        System.out.println(personBean);

    }

}
