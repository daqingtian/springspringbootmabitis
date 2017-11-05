package com.ge.dao;

import com.ge.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Mapper
public interface StudentMapper {
    List<Student> findAll();
//    List<Student> findById(Integer id);


}