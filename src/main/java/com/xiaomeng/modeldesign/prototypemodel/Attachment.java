package com.xiaomeng.modeldesign.prototypemodel;

import java.io.Serializable;

/**
 * @description:
 * @ClassName: Attachment
 * @see: com.xiaomeng.modeldesign.prototypemodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/13 0:04
 * @version: 1.0
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                '}';
    }
}
