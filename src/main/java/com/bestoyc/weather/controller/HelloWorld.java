package com.bestoyc.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: oyc
 * @Date: 2019-07-21 19:48
 * @Description: 入门HelloWorld控制类
 */
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello OuYangCheng";
    }
}
