package com.mmz.spring.beans.collections;

import com.mmz.spring.beans.Car;

import java.util.List;

/**
 * @author : mengmuzi
 * create at:  2019-06-17  21:33
 * @description:
 */
public class Person {

    private String name;
    private int age;
    private List<Car> cars;

    public Person() {

    }

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
