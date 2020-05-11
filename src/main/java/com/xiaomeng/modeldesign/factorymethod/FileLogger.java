package com.xiaomeng.modeldesign.factorymethod;

/**
 * @description:
 * @ClassName: FileLogger
 * @see: com.xiaomeng.modeldesign.factorymethod
 * @author: youngstone007@163.com
 * @createTime: 2020/5/5 17:11
 * @version: 1.0
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("write files log now....");
    }
}
