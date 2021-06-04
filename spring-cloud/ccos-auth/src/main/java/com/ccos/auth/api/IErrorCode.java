package com.ccos.auth.api;
/**
 * @Author: yexinming
 * @Description: 封装API的错误码
 * @Date: 2021/6/3 10:00 下午
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
