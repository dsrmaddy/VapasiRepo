package com.training.basic;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter array size");
        int arraySize = s.nextInt();
        int []arr = new int[arraySize];
        populateArr(arr);
        int sum = arrSum(arr);

        System.out.println("Sum of array nos is "+sum);
    }

    private static void populateArr(int[] arr) {
        int no = 1;
        for(int i=0; i<arr.length; i++,no++){
            arr[i] = no;
        }
    }


    static int arrSum(int []arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
