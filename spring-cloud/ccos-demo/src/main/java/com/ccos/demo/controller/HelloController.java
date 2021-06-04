package com.ccos.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yexinming
 * @Description: 测试
 * @Date: 2021/6/3 10:36 下午
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World.";
    }

}
