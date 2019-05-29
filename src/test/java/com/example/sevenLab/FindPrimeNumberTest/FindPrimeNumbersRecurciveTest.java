package com.example.sevenLab.FindPrimeNumberTest;

import com.example.sevenLab.FindPrimeNumber.FindPrimeNumbersNotRecurcive;
import com.example.sevenLab.FindPrimeNumber.FindPrimeNumbersRecurcive;
import com.example.sevenLab.MyException.MyException;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindPrimeNumbersRecurciveTest {

    private FindPrimeNumbersRecurcive findPrimeNumbersRecurcive = new FindPrimeNumbersRecurcive();

    @Test
    public void findPrimeNumbers() throws MyException {
        assertThat("Массив простых чисел",findPrimeNumbersRecurcive.findPrimeNumbers(Arrays.asList(50, 11, 3, 4, 42), new ArrayList<>(), 0),
                CoreMatchers.hasItems(3,11));
    }
}