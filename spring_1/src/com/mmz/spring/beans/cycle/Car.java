package com.mmz.spring.beans.cycle;

/**
 * @author : mengmuzi
 * create at:  2019-06-18  20:49
 * @description:
 */
public class Car {

    public Car(){
        System.out.println("Car's constructor.......");
    }

    private String brand;

    public void setBrand(String brand) {
        System.out.println("setBrand..........");
        this.brand = brand;
    }

    public void init(){
        System.out.println("init.......");
    }
    public void destroy(){
        System.out.println("destroy.....");

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
