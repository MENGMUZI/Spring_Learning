package com.mmz.spring.beans.annotation.service;

import com.mmz.spring.beans.annotation.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:56
 * @description:  @Autowired 注解自动装配具有兼容类型的单个 Bean属性
 */
//@Service: 标识服务层(业务层)组件
@Service
public class UserService {

    /**
     * 默认情况下, 当 IOC 容器里存在多个类型兼容的 Bean 时, 通过类型的自动装配将无法工作.
     * 此时可以在 @Qualifier 注解里提供 Bean 的名称.
     * Spring 允许对方法的入参标注 @Qualifiter 已指定注入 Bean 的名称
     * */
    //@Qualifier("userRespositoryImpl")

    @Autowired
    private UserRespository userRespository;

    public void add(){
        System.out.println("UserService's method : add.......");

        userRespository.save();

    }

}
