package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: ListBox
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:51
 * @version: 1.0
 */
public class ListBox extends Component {
    @Override
    public void display() {
        System.out.println("paint a list box");
    }
}
