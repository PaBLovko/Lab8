package com.example.sevenLab.FindPrimeNumber;

import com.example.sevenLab.MyException.MyException;

import java.util.List;

public interface Prime {
    List<Integer> findPrimeNumbers(List<Integer> list) throws MyException;
}