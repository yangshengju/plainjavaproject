package com.example.strategypattern;

public class Context {
    public IStrategy strategy;
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2) {
        return strategy.doOperation(num1,num2);
    }
}
