package com.mmz.dao;

import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  12:05
 * @description:
 */

@Repository
public abstract class BaseDao<T> {

    public abstract void save();

}
