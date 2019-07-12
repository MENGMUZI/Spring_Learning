package com.mmz.impl;

import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  22:49
 * @description:
 */

@Service
public class MyMathCalculator2 {


    public int add(int i, int j) {
        return i+j;
    }

    public int sub(int i, int j) {
        return i-j;
    }

    public int mul(int i, int j) {
        return i*j;
    }

    public int div(int i, int j) {
        return i/j;
    }


}
