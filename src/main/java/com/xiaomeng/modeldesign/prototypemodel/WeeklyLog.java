package com.xiaomeng.modeldesign.prototypemodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @description:
 * @ClassName: WeeklyLog
 * @see: com.xiaomeng.modeldesign.prototypemodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/13 0:05
 * @version: 1.0
 */
public class WeeklyLog implements Cloneable, Serializable {
    Logger log = LoggerFactory.getLogger(WeeklyLog.class);

    private Attachment attachment;
    private String title;
    private String content;

    public WeeklyLog(Attachment attachment, String title, String content) {
        this.attachment = attachment;
        this.title = title;
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * description : 深度克隆,序列化能够实现深克隆
     * param []
     * return com.xiaomeng.modeldesign.prototypemodel.WeeklyLog
     * author youngstone007@163.com
     * createTime 2020/5/13 0:21
     */
    @Override
    protected WeeklyLog clone() {
        WeeklyLog weeklyLog = null;
        try {
            //把对象转换成为流的形式,输出到输出流里面
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream obs = new ObjectOutputStream(bos);
            obs.writeObject(this);
            //把输出流里面的字节,通过输入流读取,转换成权限的对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            weeklyLog = (WeeklyLog) ois.readObject();
        } catch (Exception e) {
            log.error("序列化失败!",e);
        }
        return weeklyLog;
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "attachment=" + attachment +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
