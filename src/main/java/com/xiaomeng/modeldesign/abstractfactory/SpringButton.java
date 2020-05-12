package com.xiaomeng.modeldesign.abstractfactory;

/**
 * @description:
 * @ClassName: SpringButton
 * @see: com.xiaomeng.modeldesign.abstractfactory
 * @author: youngstone007@163.com
 * @createTime: 2020/5/12 23:25
 * @version: 1.0
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("spring button  display");
    }
}
