package com.example.service;

import com.example.damain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student studen);
    List<Student> findStudent();

}
