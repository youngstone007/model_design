package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: Window
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:50
 * @version: 1.0
 */
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("paint a window");
    }
}
