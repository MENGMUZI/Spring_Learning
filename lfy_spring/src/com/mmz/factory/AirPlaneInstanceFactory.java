package com.mmz.factory;

import com.mmz.AirPlane;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  16:32
 * @description: 实例工厂
 */
public class AirPlaneInstanceFactory {

    public AirPlane getAirPlane(String caption){

        System.out.println("AirPlaneInstanceFactory is  running..........");
        AirPlane airPlane = new AirPlane();
        airPlane.setEnginee("太行");
        airPlane.setCaption(caption);
        airPlane.setLength("180.98m");
        airPlane.setPersonNum(123);
        airPlane.setReecaption("gumin");

        return airPlane;

    }

}
