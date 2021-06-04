package com.ccos.demo.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: yexinming
 * @Description: 用户信息
 * @Date: 2021/6/3 10:44 下午
 */
@Data
public class UserDTO {
    private String username;
    private Long id;
    private List<String> roles;
}
