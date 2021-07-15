package com.equalexperts.bootcamp.mathworks.conditions;

public class Odd implements Condition {

    @Override
    public boolean isConditionSatisfied(int number) {
        return number % 2 != 0;
    }
}
