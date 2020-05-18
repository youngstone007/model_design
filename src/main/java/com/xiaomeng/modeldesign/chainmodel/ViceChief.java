package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: ViceChief
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 22:10
 * @version: 1.0
 */
public class ViceChief extends Approver {
    public ViceChief(String name) {
        super(name);
    }

    @Override
    public void doHandle(PurchaseRequest request) {
        if (request.getAmount() >= 5 && request.getAmount()<10) {
            System.out.println("当前采购单的单号: " + request.getNumber() + ", 审批金额:" + request.getAmount() +
                    ", 单据用途: " + request.getPurpose() + "; 审批处理人:ViceChief " + this.getName());
        } else {
            this.getSuccesser().doHandle(request);
        }
    }
}
