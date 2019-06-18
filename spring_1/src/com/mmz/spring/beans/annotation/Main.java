package com.mmz.spring.beans.annotation;

import com.mmz.spring.beans.annotation.controller.UserController;
import com.mmz.spring.beans.annotation.respository.UserRespository;
import com.mmz.spring.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  01:05
 * @description:  通过注解配置Bean
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

        TestObject to = (TestObject) ctx.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);

        UserRespository userRespository = (UserRespository) ctx.getBean("userRespository");
        System.out.println(userRespository);


    }
}
