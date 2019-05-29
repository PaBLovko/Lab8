package com.example.sevenLab.CalcMinNumber;

import com.example.sevenLab.MyException.ErrorCode;
import com.example.sevenLab.MyException.MyException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CalcMinNumberRecursive implements Min{

    public int minElem(List<Integer> list, int min, int index) throws MyException {
        if (list.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        if(index == 0){
            min = list.get(index);
        }
        if(min > list.get(index)) {
            min = list.get(index);
        }
        if (index < list.size() - 1){
            return minElem(list,min,++index);
        }
        return min;
    }

    @RequestMapping(value = "/сalcMinNumberRecursive", method = RequestMethod.GET)
    @ResponseBody
    public int minElem(@RequestBody List<Integer> list) throws MyException {
        return minElem(list, 0 ,0);
    }
}
