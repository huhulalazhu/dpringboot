package com.example.demo.controller;

import com.example.demo.domain.ExceptionEnum;
import com.example.demo.domain.Result;
import com.example.demo.exception.DescribeException;
import com.example.demo.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandle {
    private final static Logger log = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if(e instanceof DescribeException){

            DescribeException exception = (DescribeException) e;
            return ResultUtil.error(exception.getCode(),exception.getMessage());
        }

        log.error("系统异常"+e.getMessage(),e);
        return ResultUtil.error(ExceptionEnum.Unknown_Error);
    }
}
