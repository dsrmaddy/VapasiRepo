package com.training.oops.abstraction;

public class App {
    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank(8);
        abcBank.denomination();

        XYZBank xyzBank = new XYZBank(10);
        xyzBank.denomination();
    }
}
