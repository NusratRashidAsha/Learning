package com.java.Information;

public class Student extends Person {       //hierarchy

    void displayInformation(String studentName, int studentAge)
    {
        this.personName=studentName;
        this.personAge=studentAge;

        System.out.println(""+studentName +" is a Student.");
        System.out.println("Age is: "+studentAge);

    }


}
