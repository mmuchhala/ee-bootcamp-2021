package com.equalexperts.bootcamp.mathworks;

import com.equalexperts.bootcamp.mathworks.conditions.Condition;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static List<Integer> filter(List<Integer> numbers, Condition condition) {
        return numbers.stream().filter(condition::isConditionSatisfied).collect(Collectors.toList());
    }
}
