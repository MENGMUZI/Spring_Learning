package com.mmz.spring.beans.annotation.controller;

import org.springframework.stereotype.Controller;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:59
 * @description:
 */
//@Controller: 标识表现层组件
@Controller
public class UserController {

    public void execute(){
        System.out.println("UserController's method : execute......");
    }

}
