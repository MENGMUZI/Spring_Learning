package com.mmz.spring.beans.annotation.respository;

import org.springframework.stereotype.Repository;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:55
 * @description:
 */
//@Respository: 标识持久层组件
@Repository("userRespository")
public class UserRespositoryImpl implements UserRespository {

    @Override
    public void save() {
        System.out.println("UserRespository's method : save..........");
    }


}
