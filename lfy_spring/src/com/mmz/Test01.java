package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  10:35
 * @description: 实验01：通过IOC容器创建对象，并为属性赋值
 */
public class Test01{
    /**
     * 重要的问题：
     *  1. src 源码包开始的路径，称之为类路径的开始   所有源码包东西都会合并放在类路径里面
     *         Java 的类路径 /bin/
     *         web  /WEB-INF/classes/
     *
     *  2.先导包再创建配置文件
     *
     * 重要的细节：
     *  1.ApplicationContext 代表IOC容器接口
     *  2.给容器中注册一个组件；我们也从容器中按照ID拿到了这个组建的对象
     *          组件的创建工作，是容器完成的
     *          Person对象的创建在容器创建完成的时候就已经创建好了
     *  3.同一个组件在ioc容器中是单例，在容器启动前创建好了
     *
     *  4.容器中没有这个组件，获取组件？
     *      org.springframework.beans.factory.NoSuchBeanDefinitionException:
     *      No bean named 'person02' available
     *
     *  5.IOC容器在创建这个组件对象的时候，会利用 setter 方法为JavaBean的属性进行赋值
     *
     *  6.JavaBean的属性名是什么决定的？
     *      getter/setter方法的属性名，后面那串字母的小写
     *
     * */

    //从容器中拿到这个组件
    public static void main(String[] args) {
        //ApplicationContext 代表IOC容器
        //ClassPathXmlApplicationContext 当前应用的xml文件在ClassPath下

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person personBean = (Person) ioc.getBean("person01");

        System.out.println(personBean);

        Person personBean01 = (Person) ioc.getBean("person01");

        System.out.println(personBean == personBean01);

        System.out.println();

        //异常：org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'person02' available
        //Person personBean02 = (Person) ioc.getBean("person02");

        //System.out.println(personBean02);


    }

}
