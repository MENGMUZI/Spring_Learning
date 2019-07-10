package com.mmz;

import com.mmz.servlet.BookServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  10:52
 * @description: 实验18：使用@Autowired注解实现根据类型实现自动装配
 *
 *
 */
public class Test18 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        BookServlet bookServlet = (BookServlet) ioc.getBean("bookServlet");

        bookServlet.doGet();//直接获取会出现空指针异常java.lang.NullPointerException


    }

}
