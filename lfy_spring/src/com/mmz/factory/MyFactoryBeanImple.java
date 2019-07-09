package com.mmz.factory;

import com.mmz.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  17:13
 * @description: 继承FactoryBean的实现类
 *
 * 实现了FactoryBean接口的类是Spring可以认识的工厂类
 * Spring会自动调用工厂方法创建实例
 *
 *
 * 1.编写一个FactoryBean的实现类
 * 2.在spring配置文件进行注册
 */
public class MyFactoryBeanImple implements FactoryBean<Book> {

    //返回创建的方法
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBookName("Oldman and Sea");
        return book;
    }

    //返回创建对象的类型
    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    //是否是单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
