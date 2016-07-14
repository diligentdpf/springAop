package com.tarena.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExceptionLogger {
    @AfterThrowing(throwing="e",pointcut="within(com.tarena.dao..*)")
    public void execute(Exception e ){
        System.out.println("异常类型 ： "+e);
        StackTraceElement[] st=e.getStackTrace();//得到异常的栈追踪信息
        System.out.println("异常信息 ： "+st[0]);
    }
}
