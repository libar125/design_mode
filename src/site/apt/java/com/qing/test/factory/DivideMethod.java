package com.qing.test.factory;

public class DivideMethod implements Operation{
    public Double getResult(Double a,Double b) {
        if (b==0) {
            throw new RuntimeException("除数不能为0");
        }
        return a/b;
    }
}
