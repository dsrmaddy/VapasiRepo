package com.training.basic;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers to be compared");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();

        int temp1 = findMin(n1, n2);
        int temp2 = findMin(temp1, n3);
        int result = findMin(temp2, n4);

        System.out.println("smallest no is "+result);
    }

    private static int findMin(int n1, int n2) {
        if(n1 < n2)
            return n1;
        else
            return n2;
    }
}
