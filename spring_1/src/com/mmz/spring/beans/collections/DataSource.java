package com.mmz.spring.beans.collections;

import java.util.Properties;

/**
 * @author : mengmuzi
 * create at:  2019-06-17  22:28
 * @description:  properties
 */
public class DataSource {

    private Properties properties;

    public DataSource() {

    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
