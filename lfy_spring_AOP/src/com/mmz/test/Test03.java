package com.mmz.test;

import com.mmz.impl.MyMathCalculator2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  22:53
 * @description: cglib为没有接口的组件也创建代理对象
 *
 */
public class Test03 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyMathCalculator2 bean = (MyMathCalculator2) ioc.getBean("myMathCalculator2");

        bean.add(1,2);

        System.out.println(bean);
        System.out.println(bean.getClass());

    }

}
