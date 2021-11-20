package com.training.oops.polymorphism;

public class PlusFunctionality {

    //method to add two numbers
    public int plus(int n1, int n2) {
        return n1 + n2;
    }

    //method to add three numbers - same name as above method but different number of arguments. Method Overloading
    public int plus(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    //method to concat two strings - same name as above bt different argument type. Method Overloading
    public String plus(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        PlusFunctionality obj = new PlusFunctionality();
        System.out.println(obj.plus(4,7));
        System.out.println(obj.plus(7, 32, 89));
        System.out.println(obj.plus("cart", "ridge"));
    }
}
