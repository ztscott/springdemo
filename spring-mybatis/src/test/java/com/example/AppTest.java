package com.example;

import static org.junit.Assert.assertTrue;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Mytest()
    {
        String config = "springconfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String names[] = ac.getBeanDefinitionNames();

        for (String name:names
             ) {
            System.out.println("名字为"+name);
            System.out.print(ac.getBean(name));

        }



    }
@Test
    public void Mytest01()
    {
        String config = "springconfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student(1009,"saf","465@",17);
        int num = studentDao.insertStudent(student);
        System.out.println(num);



    }


    @Test
    public void Mytest02()
    {
        String config = "springconfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentServiceImpl dao = (StudentServiceImpl) ac.getBean("StudentService");
        Student student = new Student(1010,"zt","465@",23);
//        int num = dao.addStudent(student);
//        System.out.println(num);

        List<Student> studentlist = dao.selectstudent();
        for (Student list:studentlist
             ) {
            System.out.println(list);

        }



    }
}
