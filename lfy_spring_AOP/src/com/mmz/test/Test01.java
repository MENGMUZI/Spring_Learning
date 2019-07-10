package com.mmz.test;

import com.mmz.impl.MyMathCalculator;
import com.mmz.inter.Calculator;
import com.mmz.proxy.CalculatorProxy;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  15:20
 * @description: 动态代理添加日志功能
 * 动态代理的最大缺点：如果目标对象没有实现接口不能使用动态代理
 * 代理对象和被代理的对象唯一产生的关联就是实现同一个接口
 *
 *
 */
public class Test01 {

    public static void main(String[] args) {

        Calculator calculator = new MyMathCalculator();

        calculator.add(2,3);

        //创建一个动态代理对象
        Calculator proxy = CalculatorProxy.getProxy(calculator);

        proxy.add(2,3);

        //proxy.div(3,0);


    }

}
