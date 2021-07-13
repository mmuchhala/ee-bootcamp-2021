package com.equalexperts.bootcamp.mathworks;

import java.util.ArrayList;
import java.util.List;

// Prime filter
public class PrimeFilter {
    public static List<Integer> filter(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int number) {
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
