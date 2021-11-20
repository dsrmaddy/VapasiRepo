package com.training.basic;

import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int size = s.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter the nos: ");
        for(int i = 0; i < size; i++)
            inputArray[i] = s.nextInt();

        //call method to sort array nos in ascending order
        inputArray = sortArray(inputArray);

        System.out.println("The nos in ascending order are");
        //print the sorted array elements
        for(int i = 0; i < inputArray.length; i++)
            System.out.println(inputArray[i]);
    }

    private static int[] sortArray(int[] inputArray) {
        int temp = 0;
        for(int i = 0; i <inputArray.length; i++) {
            for(int j = i+1 ; j < inputArray.length; j++) {
                if(inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }

            }
        }
        return inputArray;
    }

}
