package com.mmz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  14:19
 * @description: 正确的为各种属性赋值
 */
public class Test04 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

        Person bean06 = (Person) ioc.getBean("person06");

        System.out.println(bean06);

        //注意这边不能直接赋值null，需要进行复杂赋值<null></null>
        System.out.println(bean06.getLastName() == null);//false  //true

        //引用赋值
        Person bean07 = (Person) ioc.getBean("person07");

        System.out.println(bean07.getCar());

        Car car = bean07.getCar();
        Car car0 = (Car) ioc.getBean("car01");

        System.out.println(car == car0);//引用的car和getBean得到的是同一个Car对象 //true

        //引用内部Bean
        Person bean08 = (Person) ioc.getBean("person08");

        System.out.println(bean08.getCar());


        //list属性赋值
        Person bean09 = (Person) ioc.getBean("person09");

        System.out.println(bean09.getBooks());

        //为map类型赋值
        Person bean10 = (Person) ioc.getBean("person10");

        System.out.println(bean10.getMaps());

        //为properties类型赋值
        Person bean11 = (Person) ioc.getBean("person11");

        System.out.println(bean11.getProperties());

        //util名称空间创建集合类型的bean

        Person bean12 = (Person) ioc.getBean("person12");

        System.out.println(bean12.getMaps());

        //级联属性赋值:属性的属性。修改Car01中的价格，原来的价格也被改变
        Person bean13 = (Person) ioc.getBean("person13");

        System.out.println(bean13.getCar());

        System.out.println(car0.getPrice() == bean13.getCar().getPrice());//true





    }

}
