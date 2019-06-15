package com.mmz.spring.beans;

/**
 * @author : mengmuzi
 * create at:  2019-06-16  01:56
 * @description:
 */
public class HelloWorld {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:" + name);

    }
}
