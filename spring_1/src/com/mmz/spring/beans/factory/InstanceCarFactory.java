package com.mmz.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  21:47
 * @description:   调用实例工厂方法创建 Bean
 */
public class InstanceCarFactory {

    private Map<String,Car> cars = null;

    public InstanceCarFactory() {
        cars = new HashMap<>();
        cars.put("ford",new Car("ford",300000));
        cars.put("KIA",new Car("KIA",500000));
    }

    public Car getCar(String brand){
        return cars.get(brand);

    }
}
