package com.example.strategypattern.impl;

import com.example.strategypattern.IStrategy;

public class OperationSubtract implements IStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
