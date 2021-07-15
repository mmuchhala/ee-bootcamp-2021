package com.equalexperts.bootcamp.mathworks;

import com.equalexperts.bootcamp.mathworks.conditions.Odd;
import com.equalexperts.bootcamp.mathworks.conditions.Prime;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FilterSpecsTest {

    private final Prime prime = new Prime();
    private final Odd odd = new Odd();

    @Test
    public void itSelectsPrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> primeNumbers = Filter.filter(numbers, prime);

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
        List<Integer> primeNumbers = Filter.filter(numbers, prime);

        //Then
        assertThat(primeNumbers, hasSize(1));
        assertThat(primeNumbers, hasItem(2));
        assertThat(primeNumbers, not(hasItems(-1, -3, 4)));
    }

    @Test
    public void selectOddReturnsOddNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3, 4);

        //When
        List<Integer> oddNumbers = Filter.filter(numbers, odd);

        //Then
        assertThat(oddNumbers, hasSize(4));
        assertThat(oddNumbers, hasItems(-3, -1, 1, 3));
    }
}
