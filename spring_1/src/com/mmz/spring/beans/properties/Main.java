package com.mmz.spring.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  16:59
 * @description:
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");

        System.out.println(dataSource.getConnection());


    }

}
