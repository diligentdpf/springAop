package com.tarena.dao;

import java.util.Date;

public class JdbcCostDao implements ICostDao {

    @Override
    public void save() {
        System.out.println("利用jdbc实现存储！");
    }

    @Override
    public void delete() {
        System.out.println("利用jdbc实现删除！");
        Date date = null;
        System.out.println(date.getClass());
    }

    @Override
    public void findById() {
        System.out.println("利用jdbc实现根据ID查询用户！");
    }

    @Override
    public void update() {
        System.out.println("利用jdbc实现用户更新！");
    }

    public static void main(String[] args) {
        Date date = null;
        System.out.println(date.getClass());
    }

}
