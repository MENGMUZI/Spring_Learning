package com.mmz.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  00:26
 * @description:
 */
//自定义的FactoryBean 需要实现 FactoryBean 的接口
public class CarFactoryBean implements FactoryBean {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //返回 bean 的对象
    @Override
    public Object getObject() throws Exception {
        return new Car(brand,500000);
    }

    //
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
