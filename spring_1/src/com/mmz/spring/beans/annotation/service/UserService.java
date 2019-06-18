package com.mmz.spring.beans.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:56
 * @description:
 */
//@Service: 标识服务层(业务层)组件
@Service
public class UserService {

    public void add(){
        System.out.println("UserService's method : add.......");
    }

}
