package com.tarena.aspect;
/**
 * @author Admini
 * @createTime 2015年9月24日 23:10
 * @description 方面组件处理逻辑
 * */
public class OpLogger {
    public void myBefore(){
        System.out.println("记录用户操作信息");
    }
}
