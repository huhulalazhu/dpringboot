package com.example.demo.controller;

import com.example.demo.domain.ExceptionEnum;
import com.example.demo.domain.Result;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ExceptionHandle  exceptionHandle;

    @RequestMapping(value = "getResult",method = RequestMethod.POST)
    public Result getResult(@RequestParam("name")String name,@RequestParam("pwd")String pwd){
        Result result = ResultUtil.success();
        try {
            if(name.equals("zzp")){

                result = ResultUtil.success(new Object());
            }else if(name.equals("pzz")){

                result = ResultUtil.error(ExceptionEnum.USER_NOT_FOUND);
            }else{
                int i = 1/0;
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;

    }
}
