package com.lc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lc
 * @Date: 2019/9/17 9:41
 */
@RestController
public class HelloController {


    @GetMapping
    public String hello(){
        return "hello";
    }
}
