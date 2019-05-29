package com.example.sevenLab.CalcMinNumber;

import com.example.sevenLab.CalcMinNumber.CalcMinNumberNotRecursive;
import com.example.sevenLab.MyException.MyException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CalcMinNumberNotRecursiveTest {

    private CalcMinNumberNotRecursive сalcMinNumberNotRecursive = new CalcMinNumberNotRecursive();

    @Test
    public void minElem() throws MyException {
        assertEquals("Minimum number",3, сalcMinNumberNotRecursive.minElem(Arrays.asList(50, 19, 3, 4, 42)));
    }
}