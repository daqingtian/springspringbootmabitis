package com.ge.controller;

import com.ge.domain.User;
import com.ge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daqingtian on 2017/11/2.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 需求整合SSM Spring Springboot mabatis
     */
    @RequestMapping("/user")
    public Map<String,List<User>> show(){
        System.out.println("user");
        Map<String,List<User>> map = new HashMap<>();
        List<User> users = userService.findAll();
        map.put("users",users);
        return map;
    }
}
