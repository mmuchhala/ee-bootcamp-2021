package com.equalexperts.bootcamp.mathworks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.equalexperts.bootcamp.mathworks.conditions.Condition.ODD;
import static com.equalexperts.bootcamp.mathworks.conditions.Condition.ODD_PRIME;
import static com.equalexperts.bootcamp.mathworks.conditions.Condition.PRIME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterSpecsTest {

    @Test
    public void itSelectsPrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> primeNumbers = Filter.filter(numbers, PRIME);

        //Then
        assertThat(primeNumbers, hasSize(2));
        assertThat(primeNumbers, hasItems(2, 3));
        assertThat(primeNumbers, not(hasItems(1, 4)));
    }

    @Test
    public void itDoesNotSelectNegativePrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);

        //When
        List<Integer> primeNumbers = Filter.filter(numbers, PRIME);

        //Then
        assertThat(primeNumbers, hasSize(1));
        assertThat(primeNumbers, hasItem(2));
        assertThat(primeNumbers, not(hasItems(-1, -3, 4)));
    }

    @Test
    public void itSelectsOddNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3, 4);

        //When
        List<Integer> oddNumbers = Filter.filter(numbers, ODD);

        //Then
        assertThat(oddNumbers, hasSize(4));
        assertThat(oddNumbers, hasItems(-3, -1, 1, 3));
    }

    @Test
    public void itSelectOddPrime() {
        //Given
        List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3, 4, 5);

        //When
        List<Integer> oddPrimeNumbers = Filter.filter(numbers, ODD_PRIME);

        //Then
        assertThat(oddPrimeNumbers, hasSize(2));
        assertThat(oddPrimeNumbers, hasItems(3, 5));
    }
}
