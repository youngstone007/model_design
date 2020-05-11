package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: DecoratorTest
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:57
 * @version: 1.0
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component component = new ScrollBarDecorator(new TextBox());
        Component component1 = new BlackBorderDecorator(component);
        component1.display();
    }
}
