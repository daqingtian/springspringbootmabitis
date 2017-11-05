package com.ge.service;

import com.ge.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daqingtian on 2017/11/2.
 */
@Service
public interface StudentService {

    List<Student> findAll();
}
