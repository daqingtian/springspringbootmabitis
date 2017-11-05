package com.ge.controller;

import com.ge.domain.Student;
import com.ge.service.StudentService;
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
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public Map<String,List<Student>>  show(){
        System.out.println("查到学生");
        Map<String,List<Student>> map = new HashMap<>();
        List<Student> students =  studentService.findAll();
        map.put("students",students);
        System.out.println(map);
        return map;
    }
}
