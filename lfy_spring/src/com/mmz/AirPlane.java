package com.mmz;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  16:25
 * @description:
 */
public class AirPlane {

    private String enginee;
    private String length;
    private Integer personNum;
    private String caption;
    private String reecaption;

    public String getEnginee() {
        return enginee;
    }

    public void setEnginee(String enginee) {
        this.enginee = enginee;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getReecaption() {
        return reecaption;
    }

    public void setReecaption(String reecaption) {
        this.reecaption = reecaption;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "enginee='" + enginee + '\'' +
                ", length='" + length + '\'' +
                ", personNum=" + personNum +
                ", caption='" + caption + '\'' +
                ", reecaption='" + reecaption + '\'' +
                '}';
    }
}
