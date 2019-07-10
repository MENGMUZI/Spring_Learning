package com.mmz.service;

import com.mmz.Person;
import com.mmz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  12:13
 * @description:
 */

@Service
public class UserService extends BaseService<Person>{
    /*@Autowired
    public UserDao userDao;

    public void save(){
        System.out.println("bookService is using userDao........");
        userDao.save();
    }*/


}
