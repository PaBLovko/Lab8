package com.example.sevenLab.FindPrimeNumber;

import org.springframework.web.bind.annotation.*;

import com.example.sevenLab.MyException.ErrorCode;
import com.example.sevenLab.MyException.MyException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FindPrimeNumbersNotRecurcive implements Prime{

    @RequestMapping(value = "/findPrimeNumbersNotRecursive", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> findPrimeNumbers(@RequestBody List<Integer> list) throws MyException {
        if (list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        return list.stream().filter(IsPrime::isPrime).collect(Collectors.toList());
    }
}
