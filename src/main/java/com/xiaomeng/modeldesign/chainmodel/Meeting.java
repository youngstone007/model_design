package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: Meeting
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 22:12
 * @version: 1.0
 */
public class Meeting extends Approver {

    public Meeting(String name) {
        super(name);
    }

    @Override
    public void doHandle(PurchaseRequest request) {
        if (request.getAmount() >= 50) {
            System.out.println("当前采购单的单号: " + request.getNumber() + ", 审批金额:" + request.getAmount() +
                    ", 单据用途: " + request.getPurpose() + "; 审批处理人:Meeting " + this.getName());
        } else {
            this.getSuccesser().doHandle(request);
        }
    }
}
