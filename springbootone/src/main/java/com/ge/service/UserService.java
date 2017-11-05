package com.ge.service;

import com.ge.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Service
public interface UserService {

    //需求查询所有user
    List<User> findAll();
}
