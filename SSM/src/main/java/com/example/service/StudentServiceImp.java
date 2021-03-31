package com.example.service;

import com.example.damain.Student;
import com.example.dao.StudentDao;

import javax.xml.ws.Service;
import java.util.List;

public class StudentServiceImp implements StudentService {
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudents();
    }
}
