package com.example.sevenLab.FindPrimeNumberTest;

import com.example.sevenLab.FindPrimeNumber.FindPrimeNumbersNotRecurcive;
import com.example.sevenLab.MyException.MyException;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FindPrimeNumbersNotRecurciveTest {

    private FindPrimeNumbersNotRecurcive findPrimeNumbersNotRecurcive = new FindPrimeNumbersNotRecurcive();

    @Test
    public void findPrimeNumbers() throws MyException {
        assertThat("Массив простых чисел", findPrimeNumbersNotRecurcive.findPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42)),
                CoreMatchers.hasItems(3,11));
    }
}