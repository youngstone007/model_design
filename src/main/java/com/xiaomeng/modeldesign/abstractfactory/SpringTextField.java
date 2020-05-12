package com.xiaomeng.modeldesign.abstractfactory;

/**
 * @description:
 * @ClassName: SpringTextField
 * @see: com.xiaomeng.modeldesign.abstractfactory
 * @author: youngstone007@163.com
 * @createTime: 2020/5/12 23:27
 * @version: 1.0
 */
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("spring textfield display");
    }
}
