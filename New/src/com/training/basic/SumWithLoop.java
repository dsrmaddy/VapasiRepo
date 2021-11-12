package com.training.basic;

public class SumWithLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum = sum+i;
        }
        System.out.println("Sum of first 100 nos is " +sum);

    }
}
