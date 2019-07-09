package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  15:34
 * @description: bean之间的依赖
 */
public class Test07 {

    public static void main(String[] args) {


        //bean之间的依赖,原本是按照创建的顺序配置Bean的顺序
        //可以改变其创建的顺序，depends-on后面跟bean
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");


    }

}
