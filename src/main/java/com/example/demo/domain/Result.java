package com.example.demo.domain;

/**
 * 异常的结果
 */
public class Result<T> {
    //errorcode 0代表成功，其他代表失败
    private Integer state;
    //失败信息，成功为success
    private String msg;
    //返回体中的出参，使用泛型返回不同的类型
    private T data;

    public Integer getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "state=" + state +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result<?> result = (Result<?>) o;

        if (!state.equals(result.state)) return false;
        if (!msg.equals(result.msg)) return false;
        return data.equals(result.data);
    }

    @Override
    public int hashCode() {
        int result = state.hashCode();
        result = 31 * result + msg.hashCode();
        result = 31 * result + data.hashCode();
        return result;
    }
}
