package com.ge.controller;

import com.ge.domain.User;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by daqingtian on 2017/11/1.
 */
@RestController  //Controller 和ResponseBody  返回的就是json数据
public class TestController {
    /**
     * 需求返回基本类型的JSON数据
     */
    @RequestMapping("/hello")
    public String show(){
        return "helloworld";
    }


    /**
     * 需求返回POJO 对象
     */
    @RequestMapping("/pojo")
    public User getPOJO(){
        User user = new User();
        user.setId(1);
        user.setAddress("北京");
        user.setBirthday(new Date());
        user.setSex("男");
        return user;
    }


    /**
     * 需求返回集合对象
     */
    @RequestMapping("/maps")
    public Map<String,Object> showMaps(){
        Map<String,Object> maps= new HashMap<>();
        User user = new User();
        user.setSex("男");
        user.setBirthday(new Date());
        maps.put("user",user);
        return maps;
    }

    @RequestMapping("/list")
    public List<User> showList(){
        User user = new User();
        user.setUsername("王鑫");
        user.setSex("男");

        User user1 = new User();
        user1.setSex("女");
        user1.setUsername("黎明");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        return list;
    }
 }
