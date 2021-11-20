package com.training.oops.abstraction;

public abstract class Bank {

    protected int noOfDenominations ;

    public Bank(int noOfDenom) {
        this.noOfDenominations = noOfDenom;
    }


    protected abstract void denomination();
}
