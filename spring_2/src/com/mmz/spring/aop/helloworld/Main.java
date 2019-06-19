package com.mmz.spring.aop.helloworld;

/**
 * @author : mengmuzi
 * create at:  2019-06-19  11:26
 * @description:
 */
public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();

        ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();

        int result = proxy.add(1, 2);
        System.out.println("result: " + result);

        result = proxy.div(1000, 20);
        System.out.println("result: " + result);
    }

}
