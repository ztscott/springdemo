package com.example.ba01;

import java.util.Date;

public class ServiceImpl implements Service {
//    @Override
    public void doSome(String name,Integer age) {
        System.out.println("=====实现业务方法====");
    }
    public String doOther(String name,Integer age){
        System.out.println("=====Other方法====");
        return "abcd";
    }
}
