package com.mmz.dao;

import com.mmz.Person;
import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  12:04
 * @description:
 */

@Repository
public class UserDao extends BaseDao<Person> {

    @Override
    public void save() {
        System.out.println("save a person....");
    }
}
