package com.mmz.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  20:59
 * @description:  创建 Bean 后置处理器
 */
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: "+ bean + "," + beanName);

        //可以实现过滤功能
        if("car".equals(bean)){
            //todo
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization: "+ bean + "," + beanName);

        //修改车的品牌
        Car car = new Car();
        car.setBrand("Auto");
        return car;
    }
}
