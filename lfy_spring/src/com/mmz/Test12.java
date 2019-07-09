package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  18:31
 * @description: 通过Spring帮助创建连接池
 */
public class Test12 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        //从容器中拿连接池
        DataSource bean = (DataSource) ioc.getBean("dataSource");


        System.out.println(bean);

    }

}
