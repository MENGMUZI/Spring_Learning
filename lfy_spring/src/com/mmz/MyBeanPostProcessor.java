package com.mmz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  17:58
 * @description:  测试bean的后置处理器: BeanPostProcessor
 */
public class MyBeanPostProcessor implements BeanPostProcessor {


    //初始化之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println( beanName + " is ready to run this postProcessBeforeInitialization method...." );
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println( beanName + " is ready to run this postProcessAfterInitialization method...." );
        return bean;
    }
}
