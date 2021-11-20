package com.training.basic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter first no:");
            int num1 = s.nextInt();
            System.out.println("Enter second no:");
            int num2 = s.nextInt();
            System.out.println("Enter operation sign (+ or - or * or /) :");
            String op = s.next();
            System.out.println("operation is "+op);
            int res;
            if(op.equals("+")) {
                res = num1+num2;
                System.out.println("Sum is " + res);
            }
            else if (op.equals("-")) {
                res = num1 - num2;
                System.out.println("Subtraction result is " + res);
            }
            else if (op.equals("*")) {
                res = num1 * num2;
                System.out.println("product  is " + res);
            }else if (op.equals("/")) {
                if(num2 != 0) {
                    res = num1 / num2;
                    System.out.println("Division result is " + res);
                }else{
                    System.out.println("Division by zero not accepted");
                }
            }else {
                System.out.println("Give valid operation sign");
            }
    }
}
