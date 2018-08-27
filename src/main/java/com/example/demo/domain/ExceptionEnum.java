package com.example.demo.domain;

/**
 * 异常的枚举类
 */
public enum ExceptionEnum {
    //未知的错误信息
    Unknown_Error(-1,"未知错误"),

    //用户不存在
    USER_NOT_FOUND(-101,"用户不存在");

    private Integer code;
    private String msg;

    private ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
