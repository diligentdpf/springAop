package com.tarena.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.ICostDao;

public class TestAopAnnotation {
    @Test
    public void test1() {
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        ICostDao dao=(ICostDao)ac.getBean("costDao");
        dao.delete();
    }
    
    @Test
    public void Test2(){
        String conf="spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        ICostDao dao=(ICostDao)ac.getBean("costDao");
        dao.delete();
    }
}
