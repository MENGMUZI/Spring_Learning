package com.mmz;

import com.mmz.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  11:53
 * @description: 使用spring的单元测试模块
 * 1.导包：spring单元测试包spring-test-4.0.0.RELEASE.jar
 * 2.@ContextConfiguration(locations="") 使用它来指定Spring的配置文件位置
 * 3.@RunWith指定用哪种驱动进行单元测试，默认是Junit
 *  @RunWith(SpringJUnit4ClassRunner.class)使用spring单元测试模块来执行@Test的测试方法
 *
 *
 */
@ContextConfiguration(locations = "classpath:ioc.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test19 {

    ApplicationContext ioc = null;

    @Autowired
    BookServlet bookServlet;

    @Test
    public void test(){
        System.out.println(bookServlet);
    }

}
