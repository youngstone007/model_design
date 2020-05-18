package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: ChainTest
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 22:13
 * @version: 1.0
 */
public class ChainTest {
    public static void main(String[] args) {
        Approver director = new Director("主任张");
        Approver viceChief = new ViceChief("副董张");
        Approver chief = new Chief("董事张");
        Approver meeting = new Meeting("董事会");
        director.setSuccesser(viceChief).setSuccesser(chief).setSuccesser(meeting);
        PurchaseRequest request = new PurchaseRequest("冰箱采购",252252352,6);
        director.doHandle(request);

    }
}
