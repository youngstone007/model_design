package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: ScrollBarDecorator
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:54
 * @version: 1.0
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void setScrollBar(){
        System.out.println(" set up the scrollbar...");
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }
}
