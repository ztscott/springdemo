package com.example;

import com.example.service.BuyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void mytest01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
        BuyService buyService = (BuyService) ac.getBean("BuyService");

        System.out.println(buyService.getClass().getName());
        buyService.Buy(1001, 8);


    }
}
