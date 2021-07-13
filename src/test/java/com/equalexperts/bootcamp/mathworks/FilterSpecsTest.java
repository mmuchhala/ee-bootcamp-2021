package com.equalexperts.bootcamp.mathworks;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FilterSpecsTest {

    @Test
    public void itSelectsPrimeNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> primeNumbers = PrimeFilter.filter(numbers);

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
        List<Integer> primeNumbers = PrimeFilter.filter(numbers);

        //Then
        assertThat(primeNumbers, hasSize(1));
        assertThat(primeNumbers, hasItem(2));
        assertThat(primeNumbers, not(hasItems(-1, -3, 4)));
    }

    @Test
    public void selectOddOnlyReturnsOddNumbers() {
        //Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //When
        List<Integer> oddNumbers = OddFilter.filter(numbers);

        //Then
        assertThat(oddNumbers, hasSize(2));
        assertThat(oddNumbers, hasItems(1, 3));
        assertThat(oddNumbers, not(hasItems(2, 4)));
    }

    @Test
    public void selectOddAlsoIncludesNegatives() {
        //Given
        List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3, 4);

        //When
        List<Integer> oddNumbers = OddFilter.filter(numbers);

        //Then
        assertThat(oddNumbers, hasSize(4));
        assertThat(oddNumbers, hasItems(-3, -1, 1, 3));
        assertThat(oddNumbers, not(hasItems(-2, 0, 2, 4)));
    }
}
