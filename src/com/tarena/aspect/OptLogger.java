package com.tarena.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @authur dpf
 * @author Administrator
 * @createTime 2015年9月25日 00:28
 * */
@Aspect
public class OptLogger {
    @Before("within(com.tarena.dao..*)")
    public void test1() {
        System.out.println("记录用户操作信息！");
    }
}
