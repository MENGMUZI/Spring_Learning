package com.mmz.spring.beans.generic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  10:09
 * @description:
 */
public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> baseRepository;

    public void add(){
        System.out.println("BaseService's method add ......");
        System.out.println(baseRepository);

    }

}
