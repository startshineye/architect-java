package com.ccos.gateway.api;

/**
 * @Author: yexinming
 * @Description: 通用返回对象
 * @Date: 2021/6/3 10:26 下午
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
