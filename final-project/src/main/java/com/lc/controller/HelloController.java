package com.lc.controller;

import com.lc.mapper.test1.User1Mapper;
import com.lc.mapper.test2.User2Mapper;
import com.lc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Lc
 * @Date: 2019/9/17 9:41
 */
@RestController
public class HelloController {

    @Autowired
    User1Mapper userMapper;

    @Autowired
    User2Mapper userMapper2;


    @GetMapping
    public String hello(){
        return "hello";
    }

    @GetMapping("addUser1")
    public String addUser1(){
        User user = new User();
        user.setName("db1User1");
        user.setPassword("db1User1");
        userMapper.insert(user);
        return "addUser1 Success";
    }

    @GetMapping("addUser2")
    public String addUser2(){
        User user = new User();
        user.setName("db1User2");
        user.setPassword("db1User2");
        userMapper2.insert(user);
        return "addUser2 Success";
    }
    @PostMapping("users")
    public String checkUsers(@RequestBody User user){
        System.out.println(user);
        return "SUccess";
    }

    @GetMapping({"user/{type}","user/{type2}/{type}"})
    public String testGetMapping(@PathVariable(value = "type",required = false) String test1,@PathVariable(value = "type2",required = false) String test2){
        System.out.println(test1);
        System.out.println(test2);
        return "SUccess";
    }
}
