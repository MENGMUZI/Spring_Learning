package com.mmz;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  14:09
 * @description:
 */
public class Car {

    private String name;
    private String color;
    private Integer price;

    public Car(){
        System.out.println("Car Constructor...");
    }

    public Car(String name, String color, Integer price) {
        this.name = name;
        this.color = color;
        this.price = price;
        System.out.println("Car Values Constructor ***** ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
