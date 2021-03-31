package com.example.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {
//    @Value("张三")
    @Value("${myname}")
    private String name;
//    @Value("19")
    @Value("${myage}")
    private int age;
//    @Value("同济大学")

//    @Autowired(required = true)引用类型使用Autowire，也可以在set方法上
//    @Qualifier("mySchool")

    @Resource //默认是byName：先使用byname自动注入，失败再byType，只使用byName就加个name属性
    private School school;

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setSchool(School school) {
        this.school = school;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student() {
    }
}
