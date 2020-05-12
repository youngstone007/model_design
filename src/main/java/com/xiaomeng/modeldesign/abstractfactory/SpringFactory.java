package com.xiaomeng.modeldesign.abstractfactory;

/**
 * @description:
 * @ClassName: SpringFactory
 * @see: com.xiaomeng.modeldesign.abstractfactory
 * @author: youngstone007@163.com
 * @createTime: 2020/5/12 23:29
 * @version: 1.0
 */
public class SpringFactory extends SkinFactory{
    @Override
    public Button getButton() {
        return new SpringButton();
    }

    @Override
    public TextField getTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox getComboBox() {
        return new SpringComBobox();
    }
}
