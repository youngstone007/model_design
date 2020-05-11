package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: BlackBorderDecorator
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:56
 * @version: 1.0
 */
public class BlackBorderDecorator extends Decorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorder(){
        System.out.println("set up the black border...");
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }
}
