package com.example.demo.util;


import com.example.demo.domain.ExceptionEnum;
import com.example.demo.domain.Result;

/**
 * 返回结果的工具类
 */
public class ResultUtil {
    /**
     * 成功返回的信息
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setState(0);
        result.setMsg("sucess");
        result.setData(object);
        return result;
    }

    /**
     * 不需要出参的接口
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 错误信息
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setState(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    /**
     * 异常信息
     * @param exceptionEnum
     * @return
     */
    public static Result error(ExceptionEnum exceptionEnum){
        Result result = new Result();
        result.setState(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }

}
