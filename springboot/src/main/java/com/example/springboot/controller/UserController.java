package com.example.springboot.controller;



import com.example.springboot.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class UserController {

    @RequestMapping(value = {"/some.do","/first.do","/register.do"},method = RequestMethod.POST)  //项目的根/
    public ModelAndView dosome(@RequestParam(value = "student") Student student){
        ModelAndView mv = new ModelAndView();
//        mv.addObject("msg","欢迎使用springmvc做web开发");
//        mv.addObject("fun","执行的是dosome方法");
        mv.addObject("mystudent",student);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/other.do",method = RequestMethod.POST)  //(项目的根/)
    public ModelAndView doother(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doother方法");
        mv.setViewName("other");

        return mv;
    }

    @RequestMapping(value = "/age.do",method = RequestMethod.POST)  //项目的根/
    public ModelAndView doage(@RequestParam(value = "rname") String name,
                              @RequestParam(value = "rage") Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        mv.setViewName("age");

        return mv;
    }

    @RequestMapping(value = "/register.do")  //项目的根/
    @ResponseBody
    public Student doregister(){
        Student student = new Student();
        student.setAge(23);
        student.setName("李四");
        System.out.println(student);
        return student;
    }

    @RequestMapping(value = "/register1.do",method = RequestMethod.POST)  //项目的根/
    @ResponseBody
    public List<Student> doregister1(){
        List<Student> list = new ArrayList<>();

        Student student = new Student("lisi",21);
        Student student1 = new Student("张三",22);
        list.add(student);
        list.add(student1);

        return list;
    }


    @RequestMapping(value = "/string.do",produces = "text/plain;charset=utf-8")  //项目的根/
    @ResponseBody
    public String doText(){

        return "成功";
    }


}


