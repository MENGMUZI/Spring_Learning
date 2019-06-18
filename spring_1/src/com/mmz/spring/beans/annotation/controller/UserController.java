package com.mmz.spring.beans.annotation.controller;

import com.mmz.spring.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:59
 * @description:  组件扫描(component scanning):  Spring 能够从 classpath 下自动扫描, 侦测和实例化具有特定注解的组件.
 *
 */
//@Controller: 标识表现层组件
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){

        System.out.println("UserController's method : execute......");
        userService.add();
    }

}
