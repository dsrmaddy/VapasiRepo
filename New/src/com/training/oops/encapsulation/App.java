package com.training.oops.encapsulation;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        College college1 = new College();
        college1.setCollegeName("Saranathan College of Engineering");
        ArrayList<String> college1DeptNames = new ArrayList<String>();
        college1DeptNames.add("CSE");
        college1DeptNames.add("IT");
        college1DeptNames.add("ECE");
        college1.setDeptNames(college1DeptNames);

        College college2 = new College();
        college2.setCollegeName("Easwari Engineering College");
        ArrayList<String> college2DeptNames = new ArrayList<String>();
        college2DeptNames.add("MBA");
        college2DeptNames.add("EIE");
        college2DeptNames.add("Biotechnology");
        college2.setDeptNames(college2DeptNames);

        College college3 = new College();
        college3.setCollegeName("Madras Medical College");
        ArrayList<String> college3DeptNames = new ArrayList<String>();
        college3DeptNames.add("Cardiology");
        college3DeptNames.add("Neurology");
        college3DeptNames.add("Radiology");
        college3.setDeptNames(college3DeptNames);

        System.out.println(college1.getCollegeName()+" has departments "+college1.getDeptNames());
        System.out.println(college2.getCollegeName()+" has departments "+college2.getDeptNames());
        System.out.println(college3.getCollegeName()+" has departments "+college3.getDeptNames());

    }
}
