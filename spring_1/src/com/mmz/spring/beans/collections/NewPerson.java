package com.mmz.spring.beans.collections;

import com.mmz.spring.beans.Car;

import java.util.Map;

/**
 * @author : mengmuzi
 * create at:  2019-06-17  22:05
 * @description:
 */
public class NewPerson {

    private String name;
    private int age;
    private Map<String,Car> cars;

    public NewPerson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
