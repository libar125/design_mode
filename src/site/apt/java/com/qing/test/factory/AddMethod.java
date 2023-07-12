package com.qing.test.factory;

import com.qing.test.factory.Operation;

public class AddMethod implements Operation {
    public Double getResult(Double a,Double b) {
        return a+b;
    }
}
