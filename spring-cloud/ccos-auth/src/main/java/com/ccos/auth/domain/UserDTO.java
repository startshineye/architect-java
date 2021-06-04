package com.ccos.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
/**
 * @Author: yexinming
 * @Description: 登录用户信息
 * @Date: 2021/6/3 10:00 下午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class UserDTO{
    private Long id;
    private String username;
    private String password;
    private Integer status;
    private List<String> roles;

}
