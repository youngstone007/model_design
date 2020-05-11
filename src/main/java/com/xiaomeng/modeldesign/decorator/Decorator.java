package com.xiaomeng.modeldesign.decorator;

/**
 * @description:
 * @ClassName: Decorator
 * @see: com.xiaomeng.modeldesign.decorator
 * @author: youngstone007@163.com
 * @createTime: 2020/5/11 21:52
 * @version: 1.0
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
