package com.xiaomeng.modeldesign.abstractfactory;

/**
 * @description:
 * @ClassName: SkinFactory
 * @see: com.xiaomeng.modeldesign.abstractfactory
 * @author: youngstone007@163.com
 * @createTime: 2020/5/12 23:22
 * @version: 1.0
 */
public abstract class SkinFactory {
    public abstract Button getButton();

    public abstract TextField getTextField();

    public abstract ComboBox getComboBox();

}
