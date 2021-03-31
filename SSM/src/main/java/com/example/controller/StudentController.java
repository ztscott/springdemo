package com.example.controller;


import com.example.damain.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController {
@Resource
    private StudentService studentService;
    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = studentService.addStudent(student);
        if(nums > 0){
            mv.addObject(tips, "学生"+student.getName()+"注册成功");
            mv.setViewName("result");//转到result.jsp
        }
        mv.addObject(tips, "学生"+student.getName()+tips);
        mv.setViewName("result");


        return mv;


    }

}
