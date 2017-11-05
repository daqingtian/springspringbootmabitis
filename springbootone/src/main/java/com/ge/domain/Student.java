package com.ge.domain;

/**
 * Created by daqingtian on 2017/11/2.
 */
public class Student {

    //1.给数据库的student 创建相应的实体类（或称modol domain 类）
    //2.dao 层创建接口
    //3，创建相应的 *mapper.xml（sql) 文件
    //4.服务层创建 服务接口，以及实现
    //5,处理器



    private Integer stuno;   //类属性 与 表中字段要相同，表中字段 如包含下划线，则类属性 去掉下划线 与表字段对应。
    private String stuname;
    private String stusex ;
    private Integer stuage ;
    private Float grade ;
    private String classno;

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }
}
