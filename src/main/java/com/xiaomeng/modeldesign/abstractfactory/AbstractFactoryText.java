package com.xiaomeng.modeldesign.abstractfactory;

/**
 * @description:
 * @ClassName: AbstractFactoryText
 * @see: com.xiaomeng.modeldesign.abstractfactory
 * @author: youngstone007@163.com
 * @createTime: 2020/5/12 23:30
 * @version: 1.0
 */
public class AbstractFactoryText {
    public static void main(String[] args) {
        SkinFactory factory = new SpringFactory();
        Button button = factory.getButton();
        ComboBox comboBox = factory.getComboBox();
        TextField textField = factory.getTextField();
        comboBox.display();
        textField.display();
        button.display();
    }
}
