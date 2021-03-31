package com.example.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class myAspect {
    @Before(value = "execution(public void com.example.ba01.ServiceImpl.doSome(String,Integer))")   //新加功能写在切面当中
    public void before(JoinPoint J){


        System.out.println( J.getTarget());
        System.out.println("前置通知，切面功能，在目标方法执行之前，日期为："+new Date());
    }

    @AfterReturning(value = "execution(* *..ServiceImpl.doOther(..))",returning = "result" )
    public void after(Object result){ //修改目标方法的执行结果
        if (result != null){

            String s = (String)result;
            result =s.toUpperCase();
        }
        System.out.println("后置通知，在目标方法之后"+result);


    }
}
