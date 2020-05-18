package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: Approver
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 21:49
 * @version: 1.0
 */
public abstract class Approver {
    private Approver successer;
    private String name;
    public abstract void doHandle(PurchaseRequest request);

    public Approver(String name) {
        this.name = name;
    }

    public Approver getSuccesser() {
        return successer;
    }

    public Approver setSuccesser(Approver successer) {
        this.successer = successer;
        return successer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
