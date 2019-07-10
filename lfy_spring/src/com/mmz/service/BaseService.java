package com.mmz.service;

import com.mmz.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  12:16
 * @description:
 */
public class BaseService<T> {

    @Autowired
    public BaseDao<T> baseDao;

    public void save(){
        System.out.println("自动注入的dao" + baseDao);
        baseDao.save();
    }

}
