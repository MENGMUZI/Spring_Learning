package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:18
 * @description:  通过注解分别创建Dao,Service,Controller
 *
 * 使用注解加入到容器中的组件，和使用配置加入到容器中的组件行为都是默认一样的
 *  1.组件的ID，默认是组件的类名首字母小写
 *  2.组件的作用域，默认就是单例
 */
public class Test15 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        //ID是类名的首字母小写
        Object bean01 = ioc.getBean("bookDao");
        Object bean02 = ioc.getBean("bookDao");


        System.out.println(bean01);

        System.out.println(bean01 == bean02);//true


    }

}
