package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: Director
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 21:58
 * @version: 1.0
 */
public class Director extends Approver {


    public Director(String name) {
        super(name);
    }

    @Override
    public void doHandle(PurchaseRequest request) {
        if (request.getAmount() < 5) {
            System.out.println("当前采购单的单号: " + request.getNumber() + ", 审批金额:" + request.getAmount() +
                    ", 单据用途: " + request.getPurpose() + "; 审批处理人:Director " + this.getName());
        } else {
            this.getSuccesser().doHandle(request);
        }
    }
}
