package com.training.oops.abstraction;

public class ABCBank extends Bank{

    public ABCBank(int noOfDenom) {
        super(noOfDenom);
    }

    @Override
    public void denomination() {
        System.out.println("Denominations available in ABC bank is :"+noOfDenominations);
    }
}
