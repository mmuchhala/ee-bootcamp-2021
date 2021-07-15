package com.equalexperts.bootcamp.mathworks.conditions;

public class Prime implements Condition {

    @Override
    public boolean isConditionSatisfied(int number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
