package com.training.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodOverloading {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first no");
        int num1 = s.nextInt();
        System.out.println("Enter first no");
        int num2 = s.nextInt();
        System.out.println("Enter first no");
        int num3 = s.nextInt();
        int sumTwo = sumTwo(num1,num2);
        int sumThree = sumThree(num1, num2, num3);
        System.out.println("Sum of first 2 nos is "+sumTwo);
        System.out.println("Sum of first 3 nos is "+sumThree);
    }

    static int sumTwo(int a, int b){
        return a+b;
    }

    static int sumThree(int a, int b, int c){
        return a+b+c;

    }
}
