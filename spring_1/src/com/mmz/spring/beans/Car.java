package com.mmz.spring.beans;

/**
 * @author : mengmuzi
 * create at:  2019-06-17  00:49
 * @description:
 */
public class Car {

    private String brand;
    private String corp;
    private int maxSpeed;
    private double price;
    public Car(){

    }
    public Car(String brand, String corp, double price){
        super();
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
