package com.xiaomeng.modeldesign.chainmodel;

/**
 * @description:
 * @ClassName: PurchaseRequest
 * @see: com.xiaomeng.modeldesign.chainmodel
 * @author: youngstone007@163.com
 * @createTime: 2020/5/18 21:53
 * @version: 1.0
 */
public class PurchaseRequest {
    private String purpose;
    private int number;
    private double amount;

    public PurchaseRequest(String purpose, int number, double amount) {
        this.purpose = purpose;
        this.number = number;
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
