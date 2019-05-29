package com.example.sevenLab.CalcMinNumber;

import com.example.sevenLab.MyException.ErrorCode;
import com.example.sevenLab.MyException.MyException;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CalcMinNumberNotRecursive implements Min{

    @RequestMapping(value = "/сalcMinNumberNotRecursive", method = RequestMethod.GET)
    @ResponseBody
    public int minElem(@RequestBody List<Integer> list) throws MyException {
        try{
            return list.stream().mapToInt(v->v).min().orElseThrow(NoSuchElementException::new);
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }
}