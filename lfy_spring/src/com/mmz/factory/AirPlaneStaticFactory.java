package com.mmz.factory;

import com.mmz.AirPlane;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  16:28
 * @description: 静态工厂类
 */
public class AirPlaneStaticFactory {

    public static AirPlane getAirPlane(String caption){
        System.out.println("AirPlaneStaticFactory is  running..........");
        AirPlane airPlane = new AirPlane();
        airPlane.setEnginee("太行");
        airPlane.setCaption(caption);
        airPlane.setLength("180.98m");
        airPlane.setPersonNum(123);
        airPlane.setReecaption("gumin");

        return airPlane;

    }

}
