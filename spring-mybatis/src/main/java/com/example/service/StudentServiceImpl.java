package com.example.service;

import com.example.dao.StudentDao;
import com.example.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int mums = studentDao.insertStudent(student);
        System.out.println("数据库数据添加成功");
        return mums;
    }

    @Override
    public List<Student> selectstudent() {
        List<Student> studentList = studentDao.selectStudents();
        return studentList;
    }
}
