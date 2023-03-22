package com.java.five;

public class QaDepartment {

    private String designation;
    private int workingYear;

//    public QaDepartment(String designation, int workingYear) {
//        this.designation = designation;
//        this.workingYear = workingYear;
//    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public void setWorkingYear(int workingYear)
    {
        this.workingYear = workingYear;
    }

    public String getDesignation()
    {
        return designation;
    }

    public int getWorkingYear()
    {
        return workingYear;
    }
}
