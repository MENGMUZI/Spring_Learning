package com.mmz.spring.beans.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  10:18
 * @description:  泛型依赖注入
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");

        UserService userService = (UserService) ctx.getBean("userService");

        userService.add();
    }

}
