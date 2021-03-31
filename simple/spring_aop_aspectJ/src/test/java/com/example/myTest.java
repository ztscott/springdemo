package com.example;

//import com.example.ba01.Service;
import com.example.ba01.Service;
import com.example.ba01.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void myTest01(){
        String config = "config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Service proxy = (Service) ac.getBean("ServiceImpl");  //没有接口spring自动应用cglib
        System.out.println(proxy.getClass().getName());
        proxy.doSome("lisi",23);
        String a = proxy.doOther("lisi",23);
        System.out.println(a);//还是目标方法中的返回值
    }
}
