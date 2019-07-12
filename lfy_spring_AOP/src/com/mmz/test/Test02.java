package com.mmz.test;

import com.mmz.impl.MyMathCalculator;
import com.mmz.inter.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  20:36
 * @description: IOC容器中保存的组件是他的代理对象
 */
public class Test02 {

    public static void main(String[] args) {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中拿到目标对象，注意：如果想要用类型获取，一定要用接口类型，不要用他本类
        //细节1：com.mmz.impl.MyMathCalculator@52bf72b5
        //class com.sun.proxy.$Proxy11
        //AOP的底层就是动态代理，容器中保存的组件是他的代理对象：$Proxy11不是本类的类型



        Calculator bean = ioc.getBean(Calculator.class);

        Calculator bean2 = (Calculator) ioc.getBean("myMathCalculator");

        System.out.println(bean);
        System.out.println(bean.getClass());
        System.out.println(bean2.getClass());

        bean.add(1,2);

        bean.div(2,1);
    }

}
