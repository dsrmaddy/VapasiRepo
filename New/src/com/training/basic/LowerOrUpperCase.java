package com.training.basic;

import java.util.Scanner;

public class LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        String input = s.nextLine();
        int ascii;
        if(input.length() == 1) {
            ascii = input.codePointAt(0);
            if(ascii >=65 && ascii <= 90) {
                System.out.println("Input is an Uppercase Alphabet");
            } else if (ascii >=97 && ascii<= 122) {
                System.out.println("Input is a Lowercase Alphabet");
            } else
                System.out.println("Input is not an alphabet at all");
        } else {
            System.out.println("Only single character allowed as input");
        }
    }
}
