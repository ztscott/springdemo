package org.example;

import org.example.entrty.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class myTest {
    @Test
    public void test01(){
        String conf = "total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        Student student = (Student) ac.getBean("Student");
        System.out.println(student);
    }
}
