package com.example.sevenLab.FindPrimeNumber;

import com.example.sevenLab.MyException.ErrorCode;
import com.example.sevenLab.MyException.MyException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class FindPrimeNumbersRecurcive implements Prime{

    public List<Integer> findPrimeNumbers(@RequestBody List<Integer> list, List<Integer> result, int index) throws MyException {
        if (list.isEmpty()) {
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(IsPrime.isPrime(list.get(index))){
            result.add(list.get(index));
        }
        if(index < list.size()-1){
            return findPrimeNumbers(list, result, ++index);
        }
        return result;
    }

    @RequestMapping(value = "/findPrimeNumbersRecursive", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> findPrimeNumbers(@RequestBody List<Integer> list) throws MyException {
        return findPrimeNumbers(list, new ArrayList<>(), 0);
    }
}
