package com.equalexperts.bootcamp.mathworks;

import java.util.ArrayList;
import java.util.List;

public class OddFilter {

    public static List<Integer> filter(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isOddNumber(number)) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    private static boolean isOddNumber(Integer number) {
        return number % 2 != 0;
    }
}
