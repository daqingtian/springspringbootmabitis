package com.ge.service.impl;

import com.ge.dao.StudentMapper;
import com.ge.domain.Student;
import com.ge.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> findAll() {;
        List<Student> list = studentMapper.findAll();
        return list;
    }
}
