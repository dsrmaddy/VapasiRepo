package com.training.basic;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Manoj";
        s1.marks = 34;
        s1.rollno = 20;

        s1.checkIfStudentPassedOrFailed();

        Student s2 = new Student();
        s2.name = "Karthik";
        s2.marks = 70;
        s2.rollno = 8;

        s2.checkIfStudentPassedOrFailed();

        ParaConstStudent para1 = new ParaConstStudent();
        ParaConstStudent para2 = new ParaConstStudent("Amy",2,56);

        System.out.println("First object "+para1.name+para1.rollno+para1.marks);
        System.out.println("First object "+para2.name+para2.rollno+para2.marks);

    }
}
