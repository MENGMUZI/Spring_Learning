package com.mmz.spring.beans.factory;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  21:32
 * @description: 调用静态工厂方法创建 Bean
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 调用静态工厂方法创建 Bean是将对象创建的过程封装到静态方法中.
 * 当客户端需要对象时, 只需要简单地调用静态方法, 而不同关心创建对象的细节.
 *
 */
public class StaticCarFactory {

    private static Map<String,Car> cars = new HashMap<>();

    static {
        cars.put("audi",new Car("audi",3000000));
        cars.put("Benz",new Car("Benz",5000000));
    }

    //静态工厂方法
    public static Car getCar(String name){
        return cars.get(name);
    }

}
