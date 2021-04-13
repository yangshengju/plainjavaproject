package com.example.strategypattern;

import com.example.strategypattern.impl.OperationAdd;
import com.example.strategypattern.impl.OperationMultiply;
import com.example.strategypattern.impl.OperationSubtract;

public class StrategyPatternDemo {

    public static void main(String[] args) {
	// write your code here
        IStrategy strategy = new OperationAdd();
        Context context = new Context(strategy);

        System.out.println("+:"+context.executeStrategy(1,2));

        strategy = new OperationSubtract();
        context = new Context(strategy);

        System.out.println("-:"+context.executeStrategy(1,2));

        strategy = new OperationMultiply();
        context = new Context(strategy);

        System.out.println("*:"+context.executeStrategy(1,2));
    }
}
