package com.training.oops.encapsulation;

import java.util.ArrayList;

public class College {
    private String collegeName;
    private ArrayList<String> deptNames;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public ArrayList<String> getDeptNames() {
        return deptNames;
    }

    public void setDeptNames(ArrayList<String> deptNames) {
        this.deptNames = deptNames;
    }
}
