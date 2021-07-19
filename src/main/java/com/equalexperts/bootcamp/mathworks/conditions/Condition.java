package com.equalexperts.bootcamp.mathworks.conditions;

public interface Condition {

    Condition PRIME = new Prime();
    Condition ODD = new Odd();
    Condition ODD_PRIME = new OddPrime();

    boolean isConditionSatisfied(int  number);
}
