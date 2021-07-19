package com.equalexperts.bootcamp.mathworks.conditions;

public class OddPrime implements Condition{

    @Override
    public boolean isConditionSatisfied(int number) {
        return PRIME.isConditionSatisfied(number) && ODD.isConditionSatisfied(number);
    }
}
