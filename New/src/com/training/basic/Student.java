package com.training.basic;

public class Student {
    String name;
    int rollno;
    int marks;

    void checkIfStudentPassedOrFailed(){
        if(marks >= 35){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

}
