package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  18:07
 * @description: 测试bean的后置处理器: BeanPostProcessor
 *
 * 单例：生命周期：（容器启动）构造器--》初始化方法--》（容器关闭）销毁方法
 * 多例：生命周期： 获取Bean时构造器--》初始化方法--》 容器关闭的时候不会调用bean的销毁方法
 * 后置处理器 在初始化方法前后加上 before 和 after 方法
 * 无论bean是否有初始化方法，后置处理器都会默认其有，还会继续工作。
 */
public class Test11 {

    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Book book02 = (Book) ioc.getBean("book02");

        System.out.println(book02);

        ((ClassPathXmlApplicationContext) ioc).close();
    }

}
