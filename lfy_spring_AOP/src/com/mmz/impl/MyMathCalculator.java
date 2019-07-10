package com.mmz.impl;

import com.mmz.inter.Calculator;
import org.springframework.stereotype.Service;

/**
 * @author : mengmuzi
 * create at:  2019-07-10  15:18
 * @description:
 */
@Service
public class MyMathCalculator implements Calculator {

    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    @Override
    public int mul(int i, int j) {
        return i*j;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
