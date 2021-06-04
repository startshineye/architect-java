package com.ccos.demo.controller;
import com.ccos.demo.api.LoginUserHolder;
import com.ccos.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: yexinming
 * @Description: 获取登录用户信息接口
 * @Date: 2021/6/3 10:38 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginUserHolder loginUserHolder;

    @GetMapping("/currentUser")
    public UserDTO currentUser() {
        return loginUserHolder.getCurrentUser();
    }
}
