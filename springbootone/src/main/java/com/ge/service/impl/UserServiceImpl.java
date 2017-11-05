package com.ge.service.impl;

import com.ge.dao.UserMapper;
import com.ge.domain.User;
import com.ge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = userMapper.findAll();
        return list;
    }



}
