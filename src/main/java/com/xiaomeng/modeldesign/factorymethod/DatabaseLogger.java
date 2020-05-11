package com.xiaomeng.modeldesign.factorymethod;

/**
 * @description: DatabaseLogger
 * @ClassName: DatabaseLogger
 * @see: com.xiaomeng.modeldesign.factorymethod
 * @author: youngstone007@163.com
 * @createTime: 2020/5/5 17:10
 * @version: 1.0
 */
public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("write database log now....");
    }
}
