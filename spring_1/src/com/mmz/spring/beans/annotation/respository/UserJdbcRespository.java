package com.mmz.spring.beans.annotation.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  01:54
 * @description:
 */
@Repository
public class UserJdbcRespository implements UserRespository{

    public void save() {
        System.out.println("UserJdbcRespository's method : save..........");
    }
}
