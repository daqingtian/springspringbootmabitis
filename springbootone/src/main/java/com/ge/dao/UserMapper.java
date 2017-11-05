package com.ge.dao;

import com.ge.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Mapper  //代替了扫描接口的操作
public interface UserMapper  {
//    //需求查询所有user
    List<User> findAll();
}
