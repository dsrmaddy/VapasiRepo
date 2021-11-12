package com.training.basic;

import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input>=1 && input <=30) {
            int modResult = input%7;
            System.out.println("Valid date is entered and modResult is "+modResult);
            switch(modResult) {
                case 1:
                    System.out.println("Day is Monday");
                    break;
                case 2:
                    System.out.println("Day is Tuesday");
                    break;
                case 3:
                    System.out.println("Day is Wednesday");
                    break;
                case 4:
                    System.out.println("Day is Thursday");
                    break;
                case 5:
                    System.out.println("Day is Friday");
                    break;
                case 6:
                    System.out.println("Day is Saturday");
                    break;
                case 0:
                    System.out.println("Day is Sunday");
                    break;
            }
        }
        else {
            System.out.println(input + " is not a valid date. Please enter between 1 and 30");
        }
    }
}
