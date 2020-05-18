package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: Chief
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 22:11
 * @version: 1.0
 */
public class Chief extends Approver{

    public Chief(String name) {
        super(name);
    }

    @Override
    public void doHandle(PurchaseRequest request) {
        if (request.getAmount() >= 10 && request.getAmount()<50) {
            System.out.println("当前采购单的单号: " + request.getNumber() + ", 审批金额:" + request.getAmount() +
                    ", 单据用途: " + request.getPurpose() + "; 审批处理人:Chief " + this.getName());
        } else {
            this.getSuccesser().doHandle(request);
        }
    }
}
