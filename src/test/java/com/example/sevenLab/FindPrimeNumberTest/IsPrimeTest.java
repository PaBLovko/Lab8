package com.example.sevenLab.FindPrimeNumberTest;

import com.example.sevenLab.FindPrimeNumber.IsPrime;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

    @Test
    public void isPrime() {
        assertTrue("Число простое", IsPrime.isPrime(11));
    }

}