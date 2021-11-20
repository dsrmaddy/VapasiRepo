package com.training.oops.abstraction;

public class XYZBank extends Bank{

    public XYZBank(int noOfDenom) {
        super(noOfDenom);
    }

    @Override
    public void denomination() {
        System.out.println("Denominations available in XYZ bank is :"+noOfDenominations);
    }
}
