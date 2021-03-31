package com.example.dao;

import com.example.damain.Student;

import java.util.List;

public interface StudentDao {
    public int insertStudent(Student student);
    public List<Student> selectStudents();
}
