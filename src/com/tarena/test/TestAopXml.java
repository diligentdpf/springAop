package com.tarena.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.dao.ICostDao;

public class TestAopXml {
    
    @Test
    public void test1(){
        String conf ="spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        //ICostDao costDao=ac.getBean("costDao",JdbcCostDao.class);这种类型会报错，报代理类型错误，换成下面这种就不会再错误
        ICostDao costDao=(ICostDao)ac.getBean("costDao");
        System.out.println(costDao.getClass().getName());
        costDao.save();
    }
    
    @Test
    public void testDelete(){
        String conf="spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        //ICostDao dao=ac.getBean("costDao",JdbcCostDao.class);
        ICostDao dao=(ICostDao)ac.getBean("costDao");
        dao.delete();
    }
    
    @Test
    public void testFindById(){
        String conf="spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
       // ICostDao dao=ac.getBean("costDao",JdbcCostDao.class);
        ICostDao dao=(ICostDao)ac.getBean("costDao");
        dao.findById();     
    }
    
    @Test
    public void testUpdate(){
        String conf="spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        //ICostDao dao=ac.getBean("costDao",JdbcCostDao.class);
        ICostDao dao=(ICostDao)ac.getBean("costDao");
        dao.update();
    }
}
