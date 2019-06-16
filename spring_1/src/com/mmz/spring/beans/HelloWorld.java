package com.mmz.spring.beans;

/**
 * @author : mengmuzi
 * create at:  2019-06-16  01:56
 * @description:
 */
public class HelloWorld {

    private String name;
    public HelloWorld(){
        System.out.println("HelloWorld's Constructor....");
    }

    public void setName(String name){
        System.out.println("setName:" + name);
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:" + name);

    }
}
