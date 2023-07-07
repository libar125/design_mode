package com.qing.test.factory;

public class OperationFactory {

    public Operation createMethod(String symbol){
        Operation operation = null;

        switch (symbol){
            case "+":
                operation = new AddMethod();
                break;
            case "-":
                operation = new SubtractMethod();
                break;
            case "*":
                operation = new MultiplyMethod();
                break;
            case "/":
                operation = new DivideMethod();
                break;
        }
        return operation;
    }
}
