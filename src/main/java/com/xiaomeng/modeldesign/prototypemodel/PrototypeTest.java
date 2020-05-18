package com.xiaomeng.modeldesign.prototypemodel;

/**
 * @description:
 * @ClassName: PrototypeTest
 * @see: com.xiaomeng.modeldesign.prototypemodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/13 0:17
 * @version: 1.0
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Attachment attachment = new Attachment("附件1");
        WeeklyLog w = new WeeklyLog(attachment,"如何养喵","给喵喂鱼就完了!");
        WeeklyLog clone = w.clone();
        System.out.println(clone == w);
        System.out.println(clone.toString());
    }
}
