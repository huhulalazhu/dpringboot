package com.example.demo.exception;

import com.example.demo.domain.ExceptionEnum;

/**
 * 自定义异常信息
 */
public class DescribeException extends RuntimeException {
    private Integer code;

    /**
     * 加入错误状态值
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = code;
    }

    /**
     * 自定义错误信息
     * @param msg
     * @param code
     */
    public DescribeException(String msg,Integer code) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
