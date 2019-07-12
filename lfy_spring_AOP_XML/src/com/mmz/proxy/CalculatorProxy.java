package com.mmz.proxy;

import com.mmz.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  15:30
 * @description: 帮Calculator生成动态代理对象
 *
 * 传入被代理对象，返回代理对象
 */
public class CalculatorProxy {

    public static Calculator getProxy(Calculator calculator){
        //方法执行器，帮我们目标对象执行目标方法
        InvocationHandler h = new InvocationHandler() {
            /**
             * Object proxy: 代理对象，给JDK使用，任何时候不要动这个对象
             * Method method: 当前将要执行的目标对象方法
             * Object[] args: 这个方法调用时外界传入的值
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //利用反射执行目标方法
                //目标方法执行后的返回值
                Object result = null;
                try{
                    System.out.println("动态代理将要执行。。。。。。。。。。。。");
                    System.out.println(method.getName() + " 方法开始执行，用的参数列表是：" + Arrays.asList(args));
                    result = method.invoke(calculator,args);
                    System.out.println(method.getName() + " 方法执行完成，执行的结果是：" + result);

                }catch (Exception e){
                    System.out.println(method.getName() + " 方法执行出现异常，异常的结果是：" + e );
                }finally {
                    System.out.println(method.getName() + " 方法最终执行完成 ");
                }
                return result;
            }
        };
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        ClassLoader loader = calculator.getClass().getClassLoader();

        //Proxy为目标对象创建代理对象
        Object newProxy = Proxy.newProxyInstance(loader, interfaces, h);
        return (Calculator) newProxy;

    }

}
