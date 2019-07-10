package com.mmz;

import com.mmz.service.BookService;
import com.mmz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  12:02
 * @description: 测试泛型依赖注入（重点，难点！！！）
 */
public class Test20 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        BookService bookService = (BookService) ioc.getBean("bookService");

        bookService.save();

        UserService userService = (UserService) ioc.getBean("userService");

        userService.save();

    }




}
