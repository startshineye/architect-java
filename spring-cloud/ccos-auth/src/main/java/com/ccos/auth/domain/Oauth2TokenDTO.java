package com.ccos.auth.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: yexinming
 * @Description: Oauth2获取Token返回信息封装
 * @Date: 2021/6/3 10:00 下午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Oauth2TokenDTO {
    /**
     * 访问令牌
     */
    private String token;
    /**
     * 刷新令牌
     */
    private String refreshToken;
    /**
     * 访问令牌头前缀
     */
    private String tokenHead;
    /**
     * 有效时间（秒）
     */
    private int expiresIn;
}
